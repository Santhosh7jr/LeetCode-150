package TwoPointers.twoSum_II_InputArrayIsSorted167_03;
import java.util.*;

class TestCase{
    int[] numbers;
    int target;

    public TestCase(int[] numbers,int target){
        this.numbers=numbers;
        this.target=target;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {2,7,11,15},9);
        TestCase testCase2=new TestCase(new int[] {2,3,4},6);
        TestCase testCase3=new TestCase(new int[] {-1,0},-1);

        System.out.println("TestCase1 Result: "+Arrays.toString(twoSum(testCase1.numbers,testCase1.target)));
        System.out.println("TestCase2 Result: "+Arrays.toString(twoSum(testCase2.numbers,testCase2.target)));
        System.out.println("TestCase3 Result: "+Arrays.toString(twoSum(testCase3.numbers,testCase3.target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int result[]={-1,-1};
        int i=0;
        int j=numbers.length-1;

        while(i<j){
            if(numbers[i]+numbers[j]==target) return new int[] {i+1,j+1};
            if(numbers[i]+numbers[j]<target) i++;
            else j--;
        }

        return result;
    }

}
