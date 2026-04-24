package SlidingWindow.substringWithConcatenationOfAllWords30_03;
import java.util.*;

class TestCase{
    String s;
    String[] words;
    public TestCase(String s,String[] words){
        this.s=s;
        this.words=words;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("barfoothefoobarman",new String[] {"foo", "bar"});
        TestCase testCase2=new TestCase("wordgoodgoodgoodbestword",new String[] {"word", "good", "best", "word"});
        TestCase testCase3=new TestCase("barfoofoobarthefoobarman",new String[] {"bar", "foo", "the"});

        System.out.println("TestCase1 Result: "+findSubstring(testCase1.s,testCase1.words));
        System.out.println("TestCase2 Result: "+findSubstring(testCase2.s,testCase2.words));
        System.out.println("TestCase3 Result: "+findSubstring(testCase3.s,testCase3.words));

    }

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words.length == 0) return result;

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int windowSize = wordLen * totalWords;

        for (int i = 0; i < wordLen; i++) {

            int left = i, right = i;
            int count = 0;

            HashMap<String, Integer> temp = new HashMap<>();

            while (right + wordLen <= s.length()) {

                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (map.containsKey(word)) {

                    temp.put(word, temp.getOrDefault(word, 0) + 1);
                    count++;

                    while (temp.get(word) > map.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        temp.put(leftWord, temp.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == totalWords) {
                        result.add(left);
                    }

                } else {
                    temp.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }

}
