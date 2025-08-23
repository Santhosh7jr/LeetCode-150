package Stack.evaluateReversePolishNotation150_04;
import java.util.*;

class TestCase {

    String[] tokens;

    public TestCase(String[] tokens) {

        this.tokens = tokens;

    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new String[] {"2","1","+","3","*"});
        TestCase testCase2 = new TestCase(new String[] {"4","13","5","/","+"});
        TestCase testCase3 = new TestCase(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"});

        System.out.println("TestCase1 Result: " + evalRPN(testCase1.tokens));
        System.out.println("TestCase2 Result: " + evalRPN(testCase2.tokens));
        System.out.println("TestCase3 Result: " + evalRPN(testCase3.tokens));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++){

            if(Character.isDigit(tokens[i].charAt(0)) || tokens[i].length()>1){
                stack.push(Integer.parseInt(tokens[i]));
            }else{

                int op2=stack.pop();
                int op1=stack.pop();

                stack.push(getResult(op1,op2,tokens[i]));

            }

        }

        return stack.pop();

    }

    public static int getResult(int op1,int op2,String operator){

        if(operator.equals("+")) return op1+op2;

        if(operator.equals("-")) return op1-op2;

        if(operator.equals("*")) return op1*op2;

        else return op1/op2;

    }

}
