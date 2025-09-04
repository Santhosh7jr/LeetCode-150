package BitManipulation.singleNumber136_04;
import java.util.*;

class TestCase {

    int[] nums;

    public TestCase(int[] nums) {
        this.nums = nums;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {2,2,1});
        TestCase testCase2 = new TestCase(new int[] {4,1,2,1,2});
        TestCase testCase3 = new TestCase(new int[] {1});

        System.out.println("TestCase1 Result: " + singleNumber(testCase1.nums));
        System.out.println("TestCase2 Result: " + singleNumber(testCase2.nums));
        System.out.println("TestCase3 Result: " + singleNumber(testCase3.nums));

    }

    public static int singleNumber(int[] nums) {

        int sum=0;

        for (int num : nums) {

            sum ^= num;

        }

        return sum;

    }

}