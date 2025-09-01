package BinarySearch.medianofTwoSortedArrays04_07;
import java.util.*;

class TestCase {

    int[] nums1;
    int[] nums2;

    public TestCase(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {1,3}, new int[] {2});
        TestCase testCase2 = new TestCase(new int[] {1,2}, new int[] {3,4});

        System.out.println("TestCase1 Result: " + findMedianSortedArrays(testCase1.nums1, testCase1.nums2));
        System.out.println("TestCase2 Result: " + findMedianSortedArrays(testCase2.nums1, testCase2.nums2));

    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {

        int newArr[]=new int[arr1.length+arr2.length];

        int p1=0;
        int p2=0;
        int i=0;

        while(p1!=arr1.length && p2!=arr2.length){

            if(arr1[p1] < arr2[p2]){
                newArr[i++]=arr1[p1++];
            }else{
                newArr[i++]=arr2[p2++];
            }

        }

        while(p1!=arr1.length){

            newArr[i++]=arr1[p1++];

        }

        while(p2!=arr2.length){

            newArr[i++]=arr2[p2++];

        }

        double avg=0;

        if(newArr.length%2==0){

            avg=(((float)newArr[newArr.length/2] + (float)newArr[(newArr.length/2)-1])/2);

        }else{

            avg=(newArr[newArr.length/2]);

        }

        return avg;

    }
}