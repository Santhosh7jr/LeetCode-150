package HashMaps.twoSum01_06;
import java.util.*;

class TestCase{
    int[] nums;
    int target;

    public TestCase(int[] nums,int target){
        this.nums=nums;
        this.target=target;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {2,7,11,15},9);
        TestCase testCase2=new TestCase(new int[] {3,2,4},6);
        TestCase testCase3=new TestCase(new int[] {3,3},6);

        System.out.println("TestCase1 result: "+ Arrays.toString(twoSum(testCase1.nums, testCase1.target)));
        System.out.println("TestCase2 result: "+ Arrays.toString(twoSum(testCase2.nums, testCase2.target)));
        System.out.println("TestCase3 result: "+ Arrays.toString(twoSum(testCase3.nums, testCase3.target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int newArr[]=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    newArr[0]=i;
                    newArr[1]=j;
                    return newArr;
                }
            }
        }
        return newArr;
    }

}
