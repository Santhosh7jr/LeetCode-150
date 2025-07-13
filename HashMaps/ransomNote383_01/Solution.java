package HashMaps.ransomNote383_01;
import java.util.*;

class TestCase{
    String ransomNote;
    String magazine;

    public TestCase(String ransomNote,String magazine){
        this.ransomNote=ransomNote;
        this.magazine=magazine;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("a","b");
        TestCase testCase2=new TestCase("aa","ab");
        TestCase testCase3=new TestCase("aa","aab");

        System.out.println("TestCase1 result: "+canConstruct(testCase1.ransomNote,testCase1.magazine));
        System.out.println("TestCase2 result: "+canConstruct(testCase2.ransomNote,testCase2.magazine));
        System.out.println("TestCase3 result: "+canConstruct(testCase3.ransomNote,testCase3.magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length()<ransomNote.length()) return false;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            if(!map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),1);
            }else{
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            if(!map.containsKey(ransomNote.charAt(i)) || map.get(ransomNote.charAt(i))==0) return false;
            else map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
        }
        return true;
    }

}
