package Matrix.setMatrixZeroes73_04;
import java.util.*;

class TestCase{
    int[][] matrix;
    public TestCase(int[][] matrix){
        this.matrix=matrix;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[][] {{1,1,1},{1,0,1},{1,1,1}});
        TestCase testCase2=new TestCase(new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});

        setZeroes(testCase1.matrix);
        setZeroes(testCase2.matrix);

        System.out.print("Testcase1 Result: [ ");
        for(int[] arr:testCase1.matrix){
            System.out.print(Arrays.toString(arr)+" ");
        }
        System.out.println("]\n");

        System.out.print("Testcase2 Result: [ ");
        for(int[] arr:testCase2.matrix){
            System.out.print(Arrays.toString(arr)+" ");
        }
        System.out.println("]");

    }

    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(Integer i:rowSet){
            markRow(matrix,i);
        }

        for(Integer i:colSet){
            markCol(matrix,i);
        }

    }

    public static void markRow(int mat[][],int row){
        for(int j=0;j<mat[row].length;j++){
            mat[row][j]=0;
        }
    }

    public static void markCol(int mat[][],int col){
        for(int j=0;j<mat.length;j++){
            mat[j][col]=0;
        }
    }

}
