package BitManipulation.addBinary67_01;
import java.util.*;

class TestCase {

    String a;
    String b;

    public TestCase(String a, String b) {
        this.a = a;
        this.b = b;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase("11", "1");
        TestCase testCase2 = new TestCase("1010", "1011");

        System.out.println("TestCase1 Result: " + addBinary(testCase1.a, testCase1.b));
        System.out.println("TestCase2 Result: " + addBinary(testCase2.a, testCase2.b));

    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {

            int bit1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;

        }

        return sb.reverse().toString();

    }

}
