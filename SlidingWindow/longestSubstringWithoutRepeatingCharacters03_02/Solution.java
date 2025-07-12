package SlidingWindow.longestSubstringWithoutRepeatingCharacters03_02;
import java.util.*;

class TestCase{
    String s;
    public TestCase(String s){
        this.s=s;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("abcabcbb");
        TestCase testCase2=new TestCase("bbbbb");
        TestCase testCase3=new TestCase("pwwkew");

        System.out.println("TestCase1 Result: "+lengthOfLongestSubstring(testCase1.s));
        System.out.println("TestCase2 Result: "+lengthOfLongestSubstring(testCase2.s));
        System.out.println("TestCase3 Result: "+lengthOfLongestSubstring(testCase3.s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();

        while(r<s.length()){
            if (set.contains(s.charAt(r))) {
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

}
