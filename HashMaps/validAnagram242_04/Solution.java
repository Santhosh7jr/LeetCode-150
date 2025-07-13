package HashMaps.validAnagram242_04;
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

        TestCase testCase1=new TestCase("anagram", "nagaram");
        TestCase testCase2=new TestCase("rat","car");

        System.out.println("TestCase1 result: "+isAnagram(testCase1.s,testCase1.t));
        System.out.println("TestCase2 result: "+isAnagram(testCase2.s,testCase2.t));

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int arr1[]=new int[26];
        int arr2[]=new int[26];

        for(int i=0;i<s.length();i++){
            arr1[(int) s.charAt(i)-'a']++;
            arr2[(int) t.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            int loc=(int) s.charAt(i)-'a';
            if(arr1[loc]!=arr2[loc]) return false;
        }
        return true;
    }

}
