package HashMaps.happyNumber202_07;
import java.util.*;

class TestCase{

    int n;

    public TestCase(int n){
        this.n=n;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(19);
        TestCase testCase2=new TestCase(2);

        System.out.println("TestCase1 result: "+isHappy(testCase1.n));
        System.out.println("TestCase2 result: "+isHappy(testCase2.n));

    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();

        while(n!=1){
            if(set.contains(n)) return false;
            set.add(n);
            n=getSquareSum(n);
        }
        return true;
    }

    public static int getSquareSum(int n){
        int sum=0;

        while(n!=0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }

}
