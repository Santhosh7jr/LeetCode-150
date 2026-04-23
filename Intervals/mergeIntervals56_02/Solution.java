package Intervals.mergeIntervals56_02;

import java.util.*;

class TestCase{
    int[][] intervals;
    public TestCase(int[][] intervals){
        this.intervals=intervals;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        TestCase testCase2 = new TestCase(new int[][]{{1, 4}, {4, 5}});
        TestCase testCase3 = new TestCase(new int[][]{{4, 7}, {1, 4}});

        System.out.print("TestCase1 Result: ");
        for (int[] row : merge(testCase1.intervals)) System.out.println(Arrays.toString(row));
        System.out.println();

        System.out.print("TestCase2 Result: ");
        for (int[] row : merge(testCase2.intervals)) System.out.println(Arrays.toString(row));
        System.out.println();

        System.out.print("TestCase3 Result: ");
        for (int[] row : merge(testCase3.intervals)) System.out.println(Arrays.toString(row));
        System.out.println();

    }

    public static int[][] merge(int[][] intervals) {

        sort(intervals);

        List<int[]> list = new ArrayList<>();
        int idx = 1;
        int start = intervals[0][0];
        int end = intervals[0][1];

        while (idx < intervals.length) {
            if(end >= intervals[idx][0] && end >= intervals[idx][1]) {
                idx++;
            } else if (end >= intervals[idx][0]) {
                end = intervals[idx][1];
                idx++;
            } else {
                list.add(new int[] {start, end});
                start = intervals[idx][0];
                end = intervals[idx][1];
                idx++;
            }
        }

        list.add(new int[] {start, end});

        int[][] result = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    private static void sort(int[][] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean flag = false;

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j][0] > arr[j + 1][0]) {
                    flag = true;
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

            if (!flag) return;

        }

    }
}