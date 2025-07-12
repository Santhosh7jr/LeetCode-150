package SlidingWindow.minimumSizeSubarraySum209_01;
import java.util.*;

class TestCase{
    int target;
    int[] nums;
    public TestCase(int target,int[] nums){
        this.target=target;
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(7,new int[] {2,3,1,2,4,3});
        TestCase testCase2=new TestCase(4,new int[] {1,4,4});
        TestCase testCase3=new TestCase(11,new int[] {1,1,1,1,1,1,1,1});

        System.out.println("TestCase1 Result: "+minSubArrayLen(testCase1.target,testCase1.nums));
        System.out.println("TestCase2 Result: "+minSubArrayLen(testCase2.target,testCase2.nums));
        System.out.println("TestCase3 Result: "+minSubArrayLen(testCase3.target,testCase3.nums));

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int count=nums.length+1;

        int l=0;
        int r=0;

        while(r<nums.length){
            sum+=nums[r++];

            while(sum>=target){
                count=Math.min(count,r-l);
                sum-=nums[l++];
            }
        }
        return count==nums.length+1?0:count;
    }

}
