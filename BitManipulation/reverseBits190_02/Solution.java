package BitManipulation.reverseBits190_02;
import java.util.*;

class TestCase {

    int n;

    public TestCase(int n) {
        this.n = n;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(43261596);
        TestCase testCase2 = new TestCase(2147483644);

        System.out.println("TestCase1 Result: " + testCase1.n);
        System.out.println("TestCase2 Result: " + testCase2.n);

    }

    public static int reverseBits(int n) {

        String str = getBinary(n);
        return convert(str);

    }

    private static String getBinary(int n) {

        int count = 0;
        String str = "";

        while (n > 0) {

            str += (n & 1);
            n >>= 1;
            count++;

        }

        for (int i = 0; i < (32 - count); i++) {

            str += 0;

        }

        return str;

    }

    private static int convert(String str) {

        int n = 0;
        int pow = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == '1') {
                n += Math.pow(2, pow);
            }

            pow++;

        }

        return n;

    }

}