package HashMaps.wordPattern290_03;
import java.util.*;

class TestCase{
    String pattern;
    String s;

    public TestCase(String pattern,String s){
        this.pattern=pattern;
        this.s=s;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("abba", "dog cat cat dog");
        TestCase testCase2=new TestCase("abba", "dog cat cat fish");
        TestCase testCase3=new TestCase("aaaa", "dog cat cat dog");

        System.out.println("TestCase1 result: "+wordPattern(testCase1.pattern,testCase1.s));
        System.out.println("TestCase2 result: "+wordPattern(testCase2.pattern,testCase2.s));
        System.out.println("TestCase3 result: "+wordPattern(testCase3.pattern,testCase3.s));

    }

    public static boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();

        if(arr.length!=pattern.length()) return false;

        for(int i=0;i<pattern.length();i++){

            if(!map.containsKey(pattern.charAt(i)) && set.contains(arr[i])){
                return false;
            }

            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),arr[i]);
                set.add(arr[i]);
                continue;
            }

            if(!map.get(pattern.charAt(i)).equals(arr[i])) return false;
        }
        return true;
    }

}
