package Matrix.spiralMatrix54_02;
import java.util.*;

class TestCase {

    int[][] matrix;

    public TestCase(int[][] matrix) {

        this.matrix = matrix;

    }

}

class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
        TestCase testCase2 = new TestCase(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}});

        System.out.println("TestCase1 Result: " + spiralOrder(testCase1.matrix));
        System.out.println("TestCase2 Result: " + spiralOrder(testCase2.matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();

        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}