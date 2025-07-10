package ArraynSring.lengthOfLastWord58_19;
import java.util.*;

class TestCase{
    String s;
    public TestCase(String s){
        this.s=s;
    }
}

public class Solution {
    public static void main(String[] args) {

    TestCase testCase1=new TestCase("Hello World");
    TestCase testCase2=new TestCase("   fly me   to   the moon  ");
    TestCase testCase3=new TestCase("luffy is still joyboy");

    System.out.println("TestCase1 Result: "+lengthOfLastWord(testCase1.s));
    System.out.println("TestCase2 Result: "+lengthOfLastWord(testCase2.s));
    System.out.println("TestCase2 Result: "+lengthOfLastWord(testCase3.s));

    }

    public static int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;

        int idx=s.length()-1;
        int count=0;

        while(idx>=0 && s.charAt(idx)==' ') idx--;

        if(idx<0) return 0;

        while(idx>=0 && s.charAt(idx)!=' '){
            count++;
            idx--;
        }

        return count;
    }
}
