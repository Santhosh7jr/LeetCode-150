package ArraynSring.jumpGame_ll_45_10;
import java.util.*;

class TestCase{
    int nums[];
    public TestCase(int[] nums){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(new int[]{2, 3, 1, 1, 4});
        TestCase testCase2 = new TestCase(new int[]{2, 3, 0, 1, 4});

        System.out.println("TestCase1 Result: " + jump(testCase1.nums));

        System.out.println("TestCase2 Result: " + jump(testCase2.nums));

    }

    public static int jump(int[] nums) {

        int l = 0;
        int r = 0;
        int steps = 0;

        while (r < nums.length - 1) {

            int farthest = 0;

            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            l = r + 1;
            r = farthest;
            steps++;

        }

        return steps;

    }

}