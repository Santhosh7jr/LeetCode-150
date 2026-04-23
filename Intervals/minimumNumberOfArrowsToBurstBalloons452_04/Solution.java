package Intervals.minimumNumberOfArrowsToBurstBalloons452_04;

import java.util.*;

class TestCase{
    int[][] points;
    public TestCase(int[][] points){
        this.points=points;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}});
        TestCase testCase2 = new TestCase(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        TestCase testCase3 = new TestCase(new int[][]{{1,2}, {2, 3}, {3, 4}, {4, 5}});

        System.out.println("TestCase1 Result: " + findMinArrowShots(testCase1.points));
        System.out.println("TestCase2 Result: " + findMinArrowShots(testCase2.points));
        System.out.println("TestCase3 Result: " + findMinArrowShots(testCase3.points));
    }

    public static int findMinArrowShots(int[][] points) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[0] != b[0])
                        return Integer.compare(a[0], b[0]);
                    return Integer.compare(a[1], b[1]);
                }
        );

        for (int[] arr : points) pq.offer(arr);

        int[] point = pq.poll();
        int count = points.length;

        while(! pq.isEmpty()) {

            int[] node = pq.poll();

            if (node[0] <= point[1]) {
                point[1] = Math.min(point[1], node[1]);
                count--;
            } else {
                point = node;
            }

        }

        return count;

    }
}