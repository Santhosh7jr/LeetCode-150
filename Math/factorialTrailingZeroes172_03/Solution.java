package Math.factorialTrailingZeroes172_03;
import java.util.*;

class TestCase {

    int n;

    public TestCase(int n) {
        this.n = n;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(3);
        TestCase testCase2 = new TestCase(5);
        TestCase testCase3 = new TestCase(0);

        System.out.println("TestCase1 Result: " + trailingZeroes(testCase1.n));
        System.out.println("TestCase2 Result: " + trailingZeroes(testCase2.n));
        System.out.println("TestCase3 Result: " + trailingZeroes(testCase3.n));

    }

    public static int trailingZeroes(int n) {
        int result = 0;

        while (n >= 5) {
            n /= 5;
            result += n;
        }

        return result;
    }
}
