package BinarySearch.searchInsertPosition35_01;
import java.util.*;

class TestCase {

    int[] nums;
    int target;

    public TestCase(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

}

class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {1,3,5,6}, 5);
        TestCase testCase2 = new TestCase(new int[] {1,3,5,6}, 2);
        TestCase testCase3 = new TestCase(new int[] {1,3,5,6}, 7);

        System.out.println("TestCase1 Result: " + searchInsert(testCase1.nums, testCase1.target));
        System.out.println("TestCase2 Result: " + searchInsert(testCase2.nums, testCase2.target));
        System.out.println("TestCase3 Result: " + searchInsert(testCase3.nums, testCase3.target));

    }

    public static int searchInsert(int[] nums, int target) {

        return bs(nums, target, 0, nums.length - 1);

    }

    private static int bs(int[] nums, int target, int start, int end) {

        if (start > end) return start;

        int mid = (start + end) / 2;

        if (nums[mid] == target) return mid;

        if (nums[mid] < target) return bs(nums, target, mid + 1, end);

        else return bs(nums, target, start, mid - 1);

    }

}
