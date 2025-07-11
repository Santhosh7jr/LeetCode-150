package TwoPointers.isSubsequence392_02;
import java.util.*;

class TestCase{
    String s;
    String t;

    public TestCase(String s,String t){
        this.s=s;
        this.t=t;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("abc","ahbgdc");
        TestCase testCase2=new TestCase("axc", "ahbgdc");

        System.out.println("TestCase1 Result: "+isSubsequence(testCase1.s,testCase1.t));
        System.out.println("TestCase2 Result: "+isSubsequence(testCase2.s,testCase2.t));

    }

    public static boolean isSubsequence(String s, String t) {
        int p1=0;
        int p2=0;

        while(p1<s.length() && p2<t.length()){
            if(s.charAt(p1)==t.charAt(p2)) p1++;
            p2++;
        }

        if((p1==s.length() && p2==t.length()) || (p1==s.length())) return true;

        return false;
    }

}
