package BitManipulation.numberOf1Bits191_03;
import java.util.*;

class TestCase {

    int n;

    public TestCase(int n) {
        this.n = n;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(11);
        TestCase testCase2 = new TestCase(128);
        TestCase testCase3 = new TestCase(2147483645);

        System.out.println("TestCase1 Result: " + hammingWeight(testCase1.n));
        System.out.println("TestCase2 Result: " + hammingWeight(testCase2.n));
        System.out.println("TestCase3 Result: " + hammingWeight(testCase3.n));

    }

    public static int hammingWeight(int n) {

        int count = 0;

        while (n > 0) {

            if((n & 1) == 1) count++;
            n >>= 1;

        }

        return count;

    }
}