package Stack.minStack155_03;
import java.util.*;

class MinStack {

    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);
        if(stack2.empty()) stack2.push(val);
        else stack2.push(Math.min(stack2.peek(),val));
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}

public class Solution {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }

}
