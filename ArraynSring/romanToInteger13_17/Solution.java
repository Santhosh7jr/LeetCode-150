package ArraynSring.romanToInteger13_17;
import java.util.*;

class TestCase{

    String s;

    public TestCase(String s) {
        this.s = s;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("III");
        TestCase testCase2=new TestCase("LVIII");
        TestCase testCase3=new TestCase("MCMXCIV");

        System.out.println("TestCase1 Result: " + romanToInt(testCase1.s));
        System.out.println("TestCase2 Result: " + romanToInt(testCase2.s));
        System.out.println("TestCase3 Result: " + romanToInt(testCase3.s));

    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
        int i;

        for(i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                result+=map.get(s.charAt(i));
            }else{
                result+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            }
        }

        if(i==s.length()-1) result+=map.get(s.charAt(i));

        return result;
    }

}
