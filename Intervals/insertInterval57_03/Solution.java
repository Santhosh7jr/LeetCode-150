package Intervals.insertInterval57_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestCase{
    int[][] intervals;
    int[] newInterval;
    public TestCase(int[][] intervals, int[] newInterval){
        this.intervals=intervals;
        this.newInterval = newInterval;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[][]{{1, 3}, {6, 9}}, new int[] {12, 16});
        TestCase testCase2 = new TestCase(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[] {4, 8});

        System.out.print("TestCase1 Result: ");
        for (int[] row : insert(testCase1.intervals, testCase1.newInterval)) System.out.println(Arrays.toString(row));
        System.out.println();

        System.out.print("TestCase2 Result: ");
        for (int[] row : insert(testCase2.intervals, testCase2.newInterval)) System.out.println(Arrays.toString(row));
        System.out.println();
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] temp = new int[intervals.length + 1][2];

        fillTemp(temp, intervals, newInterval);

        return getResult(temp);

    }

    private static int[][] getResult(int[][] temp) {

        List<List<Integer>> list = new ArrayList<>();

        int i = 0;
        int idx = 0;

        while (i < temp.length) {

            int start = temp[i][0];
            int end = temp[i][1];

            i++;

            while (i < temp.length && end >= temp[i][0]) {
                end = Math.max(temp[i][1], end);
                i++;
            }

            list.add(new ArrayList<>(Arrays.asList(start, end)));

        }

        int[][] result = new int[list.size()][2];
        idx = 0;

        for (List<Integer> node : list) {
            result[idx++] = new int[] {node.get(0), node.get(1)};
        }

        return result;

    }

    private static void fillTemp(int[][] temp, int[][] intervals, int[] newInterval) {

        int idx = 0;

        while (idx < intervals.length) {

            if (intervals[idx][0] > newInterval[0]) {
                temp[idx] = newInterval;
                break;
            }

            temp[idx] = intervals[idx];
            idx++;

        }

        if (idx == intervals.length) temp[idx] = newInterval;

        while (idx < intervals.length) {
            temp[idx + 1] = intervals[idx];
            idx++;
        }

    }
}