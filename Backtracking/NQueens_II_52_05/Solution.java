package Backtracking.NQueens_II_52_05;
import java.util.*;

class TestCase {

    int n;

    public TestCase(int n) {
        this.n = n;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(4);
        TestCase testCase2 = new TestCase(1);

        System.out.println("TestCase1 Result: " + totalNQueens(testCase1.n));
        System.out.println("TestCase2 Result: " + totalNQueens(testCase2.n));

    }

    public static int totalNQueens(int n) {
        return queens(new boolean[n][n],0);
    }

    private static int queens(boolean[][] board,int row){

        if(row==board.length) return 1;

        int count=0;

        for(int col=0;col<board.length;col++){

            if(isSafe(board,row,col)){

                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;

            }

        }

        return count;

    }

    private static boolean isSafe(boolean[][] board,int row,int col){

        for(int i=0;i<row;i++){
            if(board[i][col]) return false;
        }

        int left=Math.min(row,col);
        for(int i=1;i<=left;i++){
            if(board[row-i][col-i]) return false;
        }

        int right=Math.min(row,board.length-col-1);
        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]) return false;
        }

        return true;

    }

}
