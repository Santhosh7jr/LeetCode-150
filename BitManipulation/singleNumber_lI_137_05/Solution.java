package BitManipulation.singleNumber_lI_137_05;
import java.util.*;

class TestCase {

    int[] nums;

    public TestCase(int[] nums) {
        this.nums = nums;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {2,2,3,2});
        TestCase testCase2 = new TestCase(new int[] {0,1,0,1,0,1,99});

        System.out.println("TestCase1 Result: " + singleNumber(testCase1.nums));
        System.out.println("TestCase2 Result: " + singleNumber(testCase2.nums));

    }

    public static int singleNumber(int[] nums) {

        int num=0;

        for (int k : nums) {

            int count = 0;

            for (int i : nums) {

                if (k == i) {
                    count++;
                }

            }

            if (count == 1) {
                num = k;
            }

        }

        return num;

    }

}