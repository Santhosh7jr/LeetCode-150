package ArraynSring.zigzagConversion06_22;
import java.util.*;

class TestCase{
    String s;
    int numRows;

    public TestCase(String s,int numRows){
        this.s=s;
        this.numRows=numRows;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("PAYPALISHIRING",3);
        TestCase testCase2=new TestCase("PAYPALISHIRING",4);
        TestCase testCase3=new TestCase("A",1);

        System.out.println("TestCase1 Result: "+convert(testCase1.s,testCase1.numRows));
        System.out.println("TestCase2 Result: "+convert(testCase2.s,testCase2.numRows));
        System.out.println("TestCase3 Result: "+convert(testCase3.s,testCase3.numRows));

    }

    public static String convert(String s, int numRows) {
        StringBuilder str[]=new StringBuilder[numRows];
        int row=0;
        boolean flag=true;

        if(numRows==1) return s;

        for(int i=0;i<str.length;i++){
            str[i]=new StringBuilder();
        }

        for(int i=0;i<s.length();i++){

            if(flag) str[row++].append(s.charAt(i));
            else str[--row].append(s.charAt(i));

            if(row==0){
                flag=true;
                row++;
            }
            if(row==numRows){
                flag=false;
                row--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : str) {
            result.append(sb);
        }
        return result.toString();

    }

}
