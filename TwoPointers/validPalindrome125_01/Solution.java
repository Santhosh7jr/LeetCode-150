package TwoPointers.validPalindrome125_01;
import java.util.*;

class TestCase{
    String s;
    public TestCase(String s){
        this.s=s;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("A man, a plan, a canal: Panama");
        TestCase testCase2=new TestCase("race a car");
        TestCase testCase3=new TestCase(" ");

        System.out.println("TestCase1 Result: "+isPalindrome(testCase1.s));
        System.out.println("TestCase2 Result: "+isPalindrome(testCase2.s));
        System.out.println("TestCase3 Result: "+isPalindrome(testCase3.s));

    }

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();

        for(int i=0,j=s.length()-1;i<j;){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }

            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }

}
