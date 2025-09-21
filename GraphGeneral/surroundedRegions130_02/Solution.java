package GraphGeneral.surroundedRegions130_02;
import java.util.*;

class TestCase {

    char[][] board;

    public TestCase (char[][] board) {
        this.board = board;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new char[][] {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        });
        TestCase testCase2 = new TestCase(new char[][] {
                {'X'}
        });

        solve(testCase1.board);
        solve(testCase2.board);

        System.out.println("TestCase1 Result: ");
        for (char[] row : testCase1.board) System.out.println(Arrays.toString(row));

        System.out.println("\nTestCase2 Result: ");
        for (char[] row : testCase2.board) System.out.println(Arrays.toString(row));

    }

    public static void solve(char[][] board) {

        boolean[][] vis = new boolean[board.length][board[0].length];

        for (int i = 0; i < board[0].length; i++) {

            if (board[0][i] == 'O') dfs(board, vis, 0, i);
            if (board[board.length - 1][i] == 'O') dfs(board, vis, board.length - 1, i);

        }

        for (int i = 0; i < board.length; i++) {

            if (board[i][0] == 'O') dfs(board, vis, i, 0);
            if (board[i][board[0].length-1] == 'O') dfs(board, vis, i, board[0].length-1);

        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if(!vis[i][j] && board[i][j] == 'O') board[i][j] = 'X';

            }
        }
    }

    private static void dfs(char[][] board, boolean[][] vis, int i, int j) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || vis[i][j] || board[i][j] != 'O') return;

        vis[i][j] = true;

        dfs(board, vis, i - 1, j);
        dfs(board, vis, i, j+1);
        dfs(board, vis, i + 1, j);
        dfs(board, vis, i, j - 1);

    }

}