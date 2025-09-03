package Math.palindromeNumber09_01;
import java.util.*;

class TestCase {

    int x;

    public TestCase(int x) {
        this.x = x;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(121);
        TestCase testCase2 = new TestCase(-121);
        TestCase testCase3 = new TestCase(0);

        System.out.println("TestCase1 Result: " + isPalindrome(testCase1.x));
        System.out.println("TestCase2 Result: " + isPalindrome(testCase2.x));
        System.out.println("TestCase3 Result: " + isPalindrome(testCase3.x));

    }

    public static boolean isPalindrome(int x) {
        return x==reverse(x);
    }

    static int reverse(int x){

        int sum=0;
        int num=1;

        while(x>0){

            sum+=(x%10)*num;
            x/=10;
            num*=10;

        }

        return sum;

    }

}