package Matrix.validSudoku36_01;
import java.util.*;

class TestCase {

    char[][] board;

    public TestCase(char[][] board) {

        this.board = board;

    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new char[][] {
                {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        });

        TestCase testCase2 = new TestCase(new char[][] {
                {'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        });

        System.out.println("Testcase1 Result: "+isValidSudoku(testCase1.board));
        System.out.println("Testcase2 Result: "+isValidSudoku(testCase2.board));

    }

    public static boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                char val = board[i][j];
                if (val != '.') {
                    if (set.contains(val)) {
                        return false;
                    }
                    set.add(val);
                }
            }
        }

        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                char val = board[j][i];
                if (val != '.') {
                    if (set.contains(val)) {
                        return false;
                    }
                    set.add(val);
                }
            }
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = boxRow * 3 + i;
                        int col = boxCol * 3 + j;
                        char val = board[row][col];
                        if (val != '.') {
                            if (set.contains(val)) {
                                return false;
                            }
                            set.add(val);
                        }
                    }
                }
            }
        }

        return true;
    }

}
