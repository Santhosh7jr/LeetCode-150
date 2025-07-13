package HashMaps.isomorphicStrings205_02;
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

        TestCase testCase1=new TestCase("egg","add");
        TestCase testCase2=new TestCase("foo","bar");
        TestCase testCase3=new TestCase("paper","title");

        System.out.println("TestCase1 result: "+isIsomorphic(testCase1.s,testCase1.t));
        System.out.println("TestCase2 result: "+isIsomorphic(testCase2.s,testCase2.t));
        System.out.println("TestCase3 result: "+isIsomorphic(testCase3.s,testCase3.t));

    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> map=new HashMap<>();
        boolean arr[]=new boolean[127];

        for(int i=0;i<s.length();i++){

            if(!map.containsKey(s.charAt(i)) && arr[(int) t.charAt(i)]) return false;

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
                arr[(int) t.charAt(i)]=true;
                continue;
            }
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)) return false;
        }

        return true;
    }

}
