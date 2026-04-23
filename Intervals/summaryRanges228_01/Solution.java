package Intervals.summaryRanges228_01;

import java.util.*;

class TestCase{
    int[] nums;
    public TestCase(int[] nums){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[]{0, 1, 2, 4, 5, 7});
        TestCase testCase2 = new TestCase(new int[]{0, 2, 3, 4, 6, 8, 9});

        System.out.println("TestCase1 Result: " + summaryRanges(testCase1.nums));
        System.out.println("TestCase2 Result: " + summaryRanges(testCase2.nums));

    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        if (nums.length == 0) return list;
        if (nums.length == 1) {
            list.add("" + nums[0]);
            return list;
        }

        int num = nums[0];
        int start = num;
        int lastNumber = 0;
        int idx = 1;

        while (idx < nums.length) {

            if (nums[idx] == num + 1) {
                num++;
                idx++;
            } else {
                if (start != num) list.add(start + "->" + num);
                else list.add("" + start);
                lastNumber = num;
                num = nums[idx];
                start = num;
                idx++;
            }

            if (idx == nums.length && nums[idx - 1] == num && start != num) {
                list.add(start + "->" + num);
                lastNumber = num;
            }

        }

        if (lastNumber != nums[nums.length - 1]) {
            list.add("" + nums[nums.length - 1]);
        }

        return list;

    }
}