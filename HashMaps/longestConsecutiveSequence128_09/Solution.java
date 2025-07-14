package HashMaps.longestConsecutiveSequence128_09;
import java.util.*;

class TestCase{
    int[] nums;

    public TestCase(int[] nums){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {100,4,200,1,3,2});
        TestCase testCase2=new TestCase(new int[] {0,3,7,2,5,8,4,6,0,1});
        TestCase testCase3=new TestCase(new int[] {1,0,1,2});

        System.out.println("TestCase1 result: "+ (longestConsecutive(testCase1.nums)));
        System.out.println("TestCase2 result: "+ (longestConsecutive(testCase2.nums)));
        System.out.println("TestCase3 result: "+ (longestConsecutive(testCase3.nums)));

    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        fillSet(nums,set);

        int count=0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                count = Math.max(count, length);
            }
        }

        return count;
    }

    public static void fillSet(int nums[],HashSet<Integer> set){
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
    }

}
