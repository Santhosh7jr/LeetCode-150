package ArraynSring.removeDuplicatesFromSortedArrayII_80;

import java.util.*;

class TestCase{
    int nums[];
    public TestCase(int nums[]){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {1,1,1,2,2,3});
        TestCase testCase2=new TestCase(new int[] {0,0,1,1,1,1,2,3,3});

        int testCase1Result=removeDuplicates(testCase1.nums);
        int testCase2Result=removeDuplicates(testCase2.nums);

        System.out.println("TestCase1 Result: "+testCase1Result+" & "+ Arrays.toString(Arrays.copyOfRange(testCase1.nums,0,testCase1Result)));
        System.out.println("TestCase2 Result: "+testCase2Result+" & "+ Arrays.toString(Arrays.copyOfRange(testCase2.nums,0,testCase2Result)));

    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();

        int val=nums[0];
        int count=1;
        list.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
                val=nums[i];
                count=1;
            }

            else if(nums[i]==val && count!=2){
                list.add(nums[i]);
                count++;
            }
        }

        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }

        return list.size();
    }

}
