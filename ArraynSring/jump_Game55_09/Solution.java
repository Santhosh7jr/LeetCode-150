package ArraynSring.jump_Game55_09;
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
        TestCase testCase2 = new TestCase(new int[]{3, 2, 1, 0, 4});

        System.out.println("TestCase1 Result: " + canJump(testCase1.nums));

        System.out.println("TestCase2 Result: " + canJump(testCase2.nums));

    }

    public static boolean canJump(int[] nums) {

        int jumpIdx = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > jumpIdx) return false;

            if (jumpIdx >= nums.length - 1) return true;

            jumpIdx = Math.max(jumpIdx, (i + nums[i]));

        }

        return true;

    }

}