package Matrix.gameOfLife289_05;
import java.util.*;

class TestCase{
    int[][] board;
    public TestCase(int[][] board){
        this.board=board;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
        TestCase testCase2 = new TestCase(new int[][]{{1, 1}, {1, 0}});

        gameOfLife(testCase1.board);
        gameOfLife(testCase2.board);

        System.out.print("Testcase1 Result: [ ");
        for (int[] arr : testCase1.board) {
            System.out.print(Arrays.toString(arr) + " ");
        }
        System.out.println("]\n");

        System.out.print("Testcase2 Result: [ ");
        for (int[] arr : testCase2.board) {
            System.out.print(Arrays.toString(arr) + " ");
        }
        System.out.println("]");

    }

    public static void gameOfLife(int[][] board) {

        HashMap<List<Integer>, Integer> map = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                int neighbourCount = countNeighbours(board, i, j);
                int node = board[i][j];

                if (node == 1 && neighbourCount < 2) {
                    map.put(new ArrayList<>(Arrays.asList(i, j)), 0);
                } else if (node == 1 && neighbourCount > 3) {
                    map.put(new ArrayList<>(Arrays.asList(i, j)), 0);
                } else if (node == 0 && neighbourCount == 3) {
                    map.put(new ArrayList<>(Arrays.asList(i, j)), 1);
                }

            }
        }

        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {

            board[entry.getKey().get(0)][entry.getKey().get(1)] = entry.getValue();

        }

    }

    private static int countNeighbours(int[][] grid, int i, int j) {

        int count = 0;
        boolean im = (i - 1) >= 0;
        boolean ip = (i + 1) < grid.length;
        boolean jm = (j - 1) >= 0;
        boolean jp = (j + 1) < grid[0].length;

        if (im && jm && grid[i - 1][j - 1] == 1) count++;

        if (im && grid[i - 1][j] == 1) count++;

        if (im && jp && grid[i - 1][j + 1] == 1) count++;

        if (jp && grid[i][j + 1] == 1) count++;

        if (jm && grid[i][j - 1] == 1) count++;

        if (ip && jm && grid[i + 1][j - 1] == 1) count++;

        if (ip && grid[i + 1][j] == 1) count++;

        if (ip && jp && grid[i + 1][j + 1] == 1) count++;

        return count;

    }
}