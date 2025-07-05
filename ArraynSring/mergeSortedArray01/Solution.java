package ArraynSring.mergeSortedArray01;

import java.util.Arrays;

class TestCase{
    int nums1[];
    int m;
    int nums2[];
    int n;
    public TestCase(int nums1[],int m,int nums2[],int n){
        this.nums1=nums1;
        this.m=m;
        this.nums2=nums2;
        this.n=n;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1=new TestCase(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);
        TestCase testCase2=new TestCase(new int[] {1},1,new int[] {},0);
        TestCase testCase3=new TestCase(new int[] {0},0,new int[] {1},1);

        merge(testCase1.nums1,testCase1.m,testCase1.nums2,testCase1.n);
        System.out.println("TestCase1 Result: "+Arrays.toString(testCase1.nums1));

        merge(testCase2.nums1,testCase2.m,testCase2.nums2,testCase2.n);
        System.out.println("TestCase2 Result: "+Arrays.toString(testCase2.nums1));

        merge(testCase3.nums1,testCase3.m,testCase3.nums2,testCase3.n);
        System.out.println("TestCase3 Result: "+Arrays.toString(testCase3.nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];

        int idx1=0;
        int idx2=0;
        int x=0;

        while(idx1<m && idx2<n){
            if(nums1[idx1]<nums2[idx2]) arr[x++]=nums1[idx1++];
            else arr[x++]=nums2[idx2++];
        }

        while(idx1<m) arr[x++]=nums1[idx1++];
        while(idx2<n) arr[x++]=nums2[idx2++];

        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
    }
}