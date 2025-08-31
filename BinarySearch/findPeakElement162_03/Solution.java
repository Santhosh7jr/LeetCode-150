package BinarySearch.findPeakElement162_03;
import java.util.*;

class TestCase {

    int[] nums;

    public TestCase(int[] nums) {
        this.nums = nums;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {1,2,3,1});
        TestCase testCase2 = new TestCase(new int[] {1,2,1,3,5,6,4});

        System.out.println("TestCase1 Result: " + findPeakElement(testCase1.nums));
        System.out.println("TestCase1 Result: " + findPeakElement(testCase1.nums));

    }

    public static int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;

        if(nums[0]>nums[1]) return 0;

        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;

        return bs(nums,1,nums.length-2);
    }

    private static int bs(int nums[],int start,int end){

        if(start>end) return -1;

        int mid=(start+end)/2;

        if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;

        else if (nums[mid]<nums[mid+1]) return bs(nums,mid+1,end);

        else return bs(nums,start,mid-1);

    }

}
