package ArraynSring.longestCommonPrefix14_20;
import java.util.*;

class TestCase{
    String[] strs;
    public TestCase(String[] strs){
        this.strs=strs;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new String[] {"flower","flow","flight"});
        TestCase testCase2=new TestCase(new String[] {"dog","racecar","car"});

        System.out.println("TestCase1 Result: \""+longestCommonPrefix(testCase1.strs)+"\"");
        System.out.println("TestCase2 Result: \""+longestCommonPrefix(testCase2.strs)+"\"");

    }

    public static String longestCommonPrefix(String[] strs) {
        String result=strs[0];
        int len=result.length();
        for(int i=1;i<strs.length;i++){
            int localLen=0;
            for(int j=0;j<strs[i].length() && j<result.length();j++){
                if(strs[i].charAt(j)==result.charAt(j)) localLen++;
                else break;
            }
            len=Math.min(len,localLen);
        }
        return result.substring(0,len);
    }

}
