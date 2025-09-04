package BitManipulation.bitwiseANDofNumbersRange201_06;
import java.util.*;

class TestCase {

    int left;
    int right;

    public TestCase(int left, int right) {

        this.left = left;
        this.right = right;

    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(5, 7);
        TestCase testCase2 = new TestCase(0, 0);
        TestCase testCase3 = new TestCase(1, 2147483647);

        System.out.println("TestCase1 Result: " + rangeBitwiseAnd(testCase1.left, testCase1.right));
        System.out.println("TestCase2 Result: " + rangeBitwiseAnd(testCase2.left, testCase2.right));
        System.out.println("TestCase3 Result: " + rangeBitwiseAnd(testCase3.left, testCase3.right));

    }

    public static int rangeBitwiseAnd(int left, int right) {

        int count = 0;

        while (left < right) {

            left>>=1;
            right>>=1;
            count++;

        }

        return left<<count;

    }

}