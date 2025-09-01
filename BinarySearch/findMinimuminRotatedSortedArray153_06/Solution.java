package BinarySearch.findMinimuminRotatedSortedArray153_06;
import java.util.*;

class TestCase {

    int[] nums;

    public TestCase(int[] nums) {
        this.nums = nums;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {3,4,5,1,2});
        TestCase testCase2 = new TestCase(new int[] {4,5,6,7,0,1,2});
        TestCase testCase3 = new TestCase(new int[] {11,13,15,17});

        System.out.println("TestCase1 Result: " + findMin(testCase1.nums));
        System.out.println("TestCase2 Result: " + findMin(testCase2.nums));
        System.out.println("TestCase3 Result: " + findMin(testCase3.nums));

    }

    public static int findMin(int[] nums) {

        if(nums.length==1) return nums[0];

        if(nums[0]<nums[nums.length-1]) return nums[0];

        return search(nums,0,nums.length-1);

    }

    private static int search(int arr[],int start,int end){

        if(start>end) return -1;

        int mid=(start+end)/2;

        if(mid+1<arr.length && arr[mid]>arr[mid+1]) return arr[mid+1];

        if(mid-1>=0 && arr[mid]<arr[mid-1]) return arr[mid];

        if(arr[end]<arr[mid]) return search(arr,mid+1,end);

        return search(arr,start,mid-1);

    }
}
