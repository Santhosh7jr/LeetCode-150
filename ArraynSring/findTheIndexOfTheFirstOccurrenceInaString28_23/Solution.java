package ArraynSring.findTheIndexOfTheFirstOccurrenceInaString28_23;
import java.util.*;

class TestCase{
    String haystack;
    String needle;

    public TestCase(String haystack,String needle){
        this.haystack=haystack;
        this.needle=needle;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("sadbutsad","sad");
        TestCase testCase2=new TestCase("leetcode", "leeto");

        System.out.println("TestCase1 Result: "+strStr(testCase1.haystack,testCase1.needle));
        System.out.println("TestCase2 Result: "+strStr(testCase2.haystack,testCase2.needle));

    }

    public static int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

}
