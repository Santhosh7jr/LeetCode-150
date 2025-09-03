package Backtracking.wordSearch79_07;
import java.util.*;

class TestCase {

    char[][] board;
    String word;

    public TestCase(char[][] board, String word) {
        this.board = board;
        this.word = word;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
        TestCase testCase2 = new TestCase(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE");
        TestCase testCase3 = new TestCase(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB");

        System.out.println("TestCase1 Result: " + exist(testCase1.board, testCase1.word));
        System.out.println("TestCase2 Result: " + exist(testCase2.board, testCase2.word));
        System.out.println("TestCase3 Result: " + exist(testCase3.board, testCase3.word));

    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        boolean result = false;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    result = dfs(board, vis, word, i, j, 0);
                    if(result) return result;
                }
            }
        }

        return result;

    }

    private static boolean dfs(char[][] board, boolean[][] vis, String str, int i, int j, int idx) {

        if(idx == str.length()) return true;

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || vis[i][j]) return false;

        if(idx < str.length() && board[i][j] != str.charAt(idx)) return false;

        vis[i][j] = true;

        boolean top = dfs(board, vis, str, i - 1, j, idx + 1);

        boolean right = dfs(board, vis, str, i, j + 1, idx + 1);

        boolean bottom = dfs(board, vis, str, i + 1, j, idx + 1);

        boolean left = dfs(board, vis, str, i, j - 1, idx + 1);

        vis[i][j] = false;

        return top || right || bottom || left;

    }

}