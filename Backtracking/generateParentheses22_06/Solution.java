package Backtracking.generateParentheses22_06;
import java.util.*;

class TestCase {

    int n;

    public TestCase(int n) {
        this.n = n;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(3);
        TestCase testCase2 = new TestCase(1);

        System.out.println("TestCase1 Result: " + generateParenthesis(testCase1.n));
        System.out.println("TestCase2 Result: " + generateParenthesis(testCase2.n));

    }

    public static List<String> generateParenthesis(int n) {
        return generate(n, n, n, "", new ArrayList<>());
    }

    private static List<String> generate(int n, int open, int close, String str, List<String> list) {

        if(close < open) return list;

        if(open < 0) return list;

        if(open == 0 && close == 0) {
            list.add(str);
            return list;
        }

        generate(n, open - 1, close, str + "(", list);
        generate(n, open, close - 1, str + ")", list);

        return list;

    }

}