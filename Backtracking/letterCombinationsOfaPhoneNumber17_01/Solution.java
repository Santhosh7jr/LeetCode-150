package Backtracking.letterCombinationsOfaPhoneNumber17_01;
import java.util.*;

class TestCase {

    String digits;

    public TestCase(String digits) {
        this.digits = digits;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase("23");
        TestCase testCase2 = new TestCase("");
        TestCase testCase3 = new TestCase("2");

        System.out.println("TestCase1 Result: " + letterCombinations(testCase1.digits));
        System.out.println("TestCase2 Result: " + letterCombinations(testCase2.digits));
        System.out.println("TestCase3 Result: " + letterCombinations(testCase3.digits));

    }

    public static List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();

        String keypad[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        getCombinations(digits,"",0,list,keypad);

        return list;
    }

    public static void getCombinations(String digits,String newStr,int idx,List<String> list,String keypad[]){
        if(idx==digits.length()){
            if(!newStr.isEmpty())
                list.add(newStr);
            return;
        }

        String mapping=keypad[digits.charAt(idx)-'0'];

        for(int i=0;i<mapping.length();i++){
            getCombinations(digits,newStr+mapping.charAt(i),idx+1,list,keypad);
        }
    }

}
