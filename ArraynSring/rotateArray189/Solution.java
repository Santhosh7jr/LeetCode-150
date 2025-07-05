package ArraynSring.rotateArray189;

import java.util.*;

class TestCase{
    int nums[];
    int k;
    public TestCase(int nums[],int k){
        this.nums=nums;
        this.k=k;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {1,2,3,4,5,6,7},3);
        TestCase testCase2=new TestCase(new int[] {-1,-100,3,99},2);

        rotate(testCase1.nums,testCase1.k);
        System.out.println("TestCase1 Result: "+Arrays.toString(testCase1.nums));

        rotate(testCase2.nums,testCase2.k);
        System.out.println("TestCase2 Result: "+Arrays.toString(testCase2.nums));

    }

    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        int j=0;

        int newArr[]=new int[nums.length];

        for(int i=nums.length-k;i<nums.length;i++){
            newArr[j++]=nums[i];
        }

        for(int i=0;i<nums.length-k;i++){
            newArr[j++]=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=newArr[i];
        }
    }

}
