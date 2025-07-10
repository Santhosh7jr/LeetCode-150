package ArraynSring.productOfArrayExceptSelf238_13;
import java.util.*;

class TestCase{
    int[] nums;
    public TestCase(int[] nums){
        this.nums=nums;
    }
}

public class Solution {
    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {1,2,3,4});
        TestCase testCase2=new TestCase(new int[] {-1,1,0,-3,3});

        System.out.println("TestCase1 Result: "+Arrays.toString(productExceptSelf(testCase1.nums)));
        System.out.println("TestCase2 Result: "+Arrays.toString(productExceptSelf(testCase2.nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int result[]=new int[nums.length];

        left[0]=1;

        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        int right=1;

        for(int i=nums.length-1;i>=0;i--){
            result[i]=left[i]*right;
            right*=nums[i];
        }

        return result;
    }
}
