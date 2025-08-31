package BinarySearch.searcha2DMatrix74_02;
import java.util.*;

class TestCase {

    int[][] matrix;
    int target;

    public TestCase(int[][] matrix, int target) {
        this.matrix = matrix;
        this.target = target;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}},3);
        TestCase testCase2 = new TestCase(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}},13);

        System.out.println("TestCase1 Result: " + searchMatrix(testCase1.matrix, testCase1.target));
        System.out.println("TestCase2 Result: " + searchMatrix(testCase2.matrix, testCase2.target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;

        int start = 0;
        int end = matrix.length - 1;
        int idx = matrix[0].length - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            if (target == matrix[mid][idx]) return true;

            if(target > matrix[mid][idx]) start = mid + 1;

            else end = mid;

        }

        return bs(matrix[start], target, 0, idx);

    }

    private static boolean bs(int[] arr, int target, int start, int end){

        if (start > end) return false;

        int mid = (start + end) / 2;

        if (target == arr[mid]) return true;

        if (target > arr[mid]) return bs(arr, target, mid + 1, end);

        else return bs(arr, target, start, mid - 1);

    }

}