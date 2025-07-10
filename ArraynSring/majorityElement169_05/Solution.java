package ArraynSring.majorityElement169_05;

import java.util.*;

class TestCase{
    int[] nums;
    public TestCase(int[] nums){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {3,2,3});
        TestCase testCase2=new TestCase(new int[] {2,2,1,1,1,2,2});

        System.out.println("TestCase1 Result: "+majorityElement(testCase1.nums));
        System.out.println("TestCase2 Result: "+majorityElement(testCase2.nums));
    }

//    public  static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

}
