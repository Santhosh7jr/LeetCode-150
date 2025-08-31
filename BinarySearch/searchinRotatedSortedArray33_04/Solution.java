package BinarySearch.searchinRotatedSortedArray33_04;
import java.util.*;

class TestCase {

    int[] nums;
    int target;

    public TestCase(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {4,5,6,7,0,1,2}, 0);
        TestCase testCase2 = new TestCase(new int[] {4,5,6,7,0,1,2}, 3);
        TestCase testCase3 = new TestCase(new int[] {1}, 0);

        System.out.println("TestCase1 Result: " + search(testCase1.nums, testCase1.target));
        System.out.println("TestCase2 Result: " + search(testCase2.nums, testCase2.target));
        System.out.println("TestCase3 Result: " + search(testCase3.nums, testCase3.target));

    }

    public static int search(int[] nums, int target) {

        int pivot=getPivot(nums,0,nums.length-1);

        int result = bs(nums,target,0,pivot);

        return (result!=-1) ? result : bs(nums,target,pivot+1,nums.length-1);
    }

    private static int getPivot(int nums[],int start,int end){

        if(start>end) return 0;

        int mid=(start+end)/2;

        if(mid+1<nums.length && nums[mid]>nums[mid+1]) return mid;

        if(mid-1>=0 && nums[mid]<nums[mid-1]) return mid-1;

        if(nums[mid]<nums[0]) return getPivot(nums,start,mid-1);

        else return getPivot(nums,mid+1,end);

    }

    private static int bs(int nums[],int target,int start,int end){

        if(start>end) return -1;

        int mid=(start+end)/2;

        if(nums[mid]==target) return mid;

        if(nums[mid]<target) return bs(nums,target,mid+1,end);

        else return bs(nums,target,start,mid-1);

    }

}