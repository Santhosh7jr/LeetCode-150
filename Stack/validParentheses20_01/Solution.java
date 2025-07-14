package Stack.validParentheses20_01;
import java.util.*;

class TestCase{
    String s;

    public TestCase(String s){
        this.s=s;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("()");
        TestCase testCase2=new TestCase("()[]{}");
        TestCase testCase3=new TestCase("(]");
        TestCase testCase4=new TestCase("([])");

        System.out.println("TestCase1 result: "+ (isValid(testCase1.s)));
        System.out.println("TestCase2 result: "+ (isValid(testCase2.s)));
        System.out.println("TestCase3 result: "+ (isValid(testCase3.s)));
        System.out.println("TestCase4 result: "+ (isValid(testCase4.s)));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char item=s.charAt(i);
            if(item=='(' || item=='[' || item=='{'){
                stack.push(item);
            }

            else if((item==')' || item==']' || item=='}') && stack.size()==0){
                return false;
            }

            else if(item==']'){
                if(stack.peek()=='[') stack.pop();
                else return false;
            }

            else if(item==')'){
                if(stack.peek()=='(') stack.pop();
                else return false;
            }

            else if(item=='}'){
                if(stack.peek()=='{') stack.pop();
                else return false;
            }
        }
        return stack.size()==0;
    }

}
