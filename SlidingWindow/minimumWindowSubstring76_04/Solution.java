package SlidingWindow.minimumWindowSubstring76_04;

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

        TestCase testCase1=new TestCase("ADOBECODEBANC", "ABC");
        TestCase testCase2=new TestCase("a","a");
        TestCase testCase3=new TestCase("a","aa");

        System.out.println("TestCase1 Result: "+minWindow(testCase1.s,testCase1.t));
        System.out.println("TestCase2 Result: "+minWindow(testCase2.s,testCase2.t));
        System.out.println("TestCase3 Result: "+minWindow(testCase3.s,testCase3.t));

    }

    public static String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) count++;
                map.put(ch, map.get(ch) - 1);
            }

            while (count == t.length()) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char ch2 = s.charAt(left);

                if (map.containsKey(ch2)) {
                    map.put(ch2, map.get(ch2) + 1);
                    if (map.get(ch2) > 0) count--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

}
