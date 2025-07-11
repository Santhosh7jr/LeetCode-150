package ArraynSring.reverseWordsInaString151_21;
import java.util.*;

class TestCase{
    String s;
    public TestCase(String s){
        this.s=s;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("the sky is blue");
        TestCase testCase2=new TestCase("  hello world  ");
        TestCase testCase3=new TestCase("a good   example");

        System.out.println("TestCase1 Result: "+reverseWords(testCase1.s));
        System.out.println("TestCase2 Result: "+reverseWords(testCase2.s));
        System.out.println("TestCase3 Result: "+reverseWords(testCase3.s));

    }

    public static String reverseWords(String s) {
        List<String> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)==' '){
                        list.add(s.substring(i,j));
                        i=j;
                        break;
                    }
                }
            }
        }
        if(!s.endsWith(" ")){
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)==' '){
                    list.add(s.substring(i+1));
                    break;
                }
            }
        }

        if(!s.contains(" ")){
            list.add(s);
        }

        StringBuffer sb = new StringBuffer();

        for(int i=list.size()-1;i>=0;i--){
            sb.append(" "+list.get(i));
        }
        return (String) sb.substring(1);
    }

}
