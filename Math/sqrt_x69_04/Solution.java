package Math.sqrt_x69_04;
import java.util.*;

class TestCase {

    int x;

    public TestCase(int x) {
        this.x = x;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(4);
        TestCase testCase2 = new TestCase(8);

        System.out.println("TestCase1 Result: " + mySqrt(testCase1.x));
        System.out.println("TestCase2 Result: " + mySqrt(testCase2.x));

    }

    public static int mySqrt(int x) {

        int result=-1;

        int left=0;
        int right=x;

        while(right>=left){

            int mid=(left+right)/2;

            if((long) mid*mid<=x){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }

        }

        return result;

    }
}