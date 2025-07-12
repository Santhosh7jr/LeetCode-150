package Matrix.rotateImage48_03;
import java.util.*;

class TestCase{
    int[][] matrix;
    public TestCase(int[][] matrix){
        this.matrix=matrix;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
        TestCase testCase2=new TestCase(new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});

        rotate(testCase1.matrix);
        rotate(testCase2.matrix);

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

    public static void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            swap(matrix[i]);
        }
    }

    public static void swap(int arr[]){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

}
