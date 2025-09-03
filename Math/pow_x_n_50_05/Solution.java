package Math.pow_x_n_50_05;
import java.util.*;

class TestCase {

    double x;
    int n;

    public TestCase(double x, int n) {
        this.x = x;
        this.n = n;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(2.0d, 10);
        TestCase testCase2 = new TestCase(2.1d, 3);
        TestCase testCase3 = new TestCase(2.0d, 2);

        System.out.println("TestCase1 Result: " + myPow(testCase1.x, testCase1.n));
        System.out.println("TestCase2 Result: " + myPow(testCase2.x, testCase2.n));
        System.out.println("TestCase3 Result: " + myPow(testCase3.x, testCase3.n));

    }

    public static double myPow(double x, int n) {

        long m = n;
        double ans = 1;

        if (m < 0) {
            m = -m;
            x = 1 / x;
        }

        while(m>0){

            if(m%2==1){
                ans*=x;
                m-=1;
            }else{
                m/=2;
                x*=x;
            }

        }

        return ans;

    }

}