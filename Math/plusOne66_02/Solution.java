package Math.plusOne66_02;
import java.util.*;

class TestCase {

    int[] digits;

    public TestCase(int[] digits) {
        this.digits = digits;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {1,2,3});
        TestCase testCase2 = new TestCase(new int[] {4,3,2,1});
        TestCase testCase3 = new TestCase(new int[] {9});

        System.out.println("TestCase1 Result: " + Arrays.toString(plusOne(testCase1.digits)));
        System.out.println("TestCase1 Result: " + Arrays.toString(plusOne(testCase2.digits)));
        System.out.println("TestCase1 Result: " + Arrays.toString(plusOne(testCase3.digits)));

    }

    public static int[] plusOne(int[] digits) {

        int num=0;
        int count=1;

        for(int i=digits.length-1;i>=0;i--){
            num+=digits[i]*count;
            count*=10;
        }

        num+=1;

        int num2=num;
        int count2=0;

        while(num2!=0){
            count2+=1;
            num2/=10;
        }

        int[] na=new int[count2];

        for(int i=0;i<count2;i++){
            na[i]=num%10;
            num/=10;
        }

        int[] na2=new int[na.length];
        int nn=0;

        for(int i=na.length-1;i>=0;i--){
            na2[nn]=na[i];
            nn+=1;
        }

        return na2;

    }

}