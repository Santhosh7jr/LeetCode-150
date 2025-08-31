package BinarySearch.findFirstandLastPositionofElementinSortedArray34_05;
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

        TestCase testCase1 = new TestCase(new int[] {5,7,7,8,8,10}, 8);
        TestCase testCase2 = new TestCase(new int[] {5,7,7,8,8,10}, 6);
        TestCase testCase3 = new TestCase(new int[] {}, 0);

        System.out.println("TestCase1 Result: " + Arrays.toString(searchRange(testCase1.nums, testCase1.target)));
        System.out.println("TestCase2 Result: " + Arrays.toString(searchRange(testCase2.nums, testCase2.target)));
        System.out.println("TestCase3 Result: " + Arrays.toString(searchRange(testCase3.nums, testCase3.target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int left=leftSearch(nums,target);
        int right=rightSearch(nums,target);

        return new int[] {left,right};
    }

    private static int leftSearch(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                result=mid;
                right=mid-1;
            }
            else if(target<arr[mid]) right=mid-1;
            else left=mid+1;

        }

        return result;
    }

    private static int rightSearch(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                result=mid;
                left=mid+1;
            }
            else if(target<arr[mid]) right=mid-1;
            else left=mid+1;

        }

        return result;
    }
}