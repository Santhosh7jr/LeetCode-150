package ArraynSring.removeElement02;

import java.util.Arrays;

class TestCase{
    int nums[];
    int val;
    public TestCase(int nums[],int val){
        this.nums=nums;
        this.val=val;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {3,2,2,3},3);
        TestCase testCase2=new TestCase(new int[] {0,1,2,2,3,0,4,2},2);

        int testCase1Result=removeElement(testCase1.nums,testCase1.val);
        int testCase2Result=removeElement(testCase2.nums,testCase2.val);

        System.out.println("TestCase1 Result: "+testCase1Result+" & "+ Arrays.toString(Arrays.copyOfRange(testCase1.nums,0,testCase1Result)));
        System.out.println("TestCase2 Result: "+testCase2Result+" & "+ Arrays.toString(Arrays.copyOfRange(testCase2.nums,0,testCase2Result)));
    }

    public static int removeElement(int[] nums, int val) {
        int count=0;
        int idx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[idx++]=nums[i];
            }else{
                count++;
            }
        }
        return nums.length-count;
    }
}
