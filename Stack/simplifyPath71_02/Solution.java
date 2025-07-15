package Stack.simplifyPath71_02;
import java.util.*;

class TestCase{
    String path;

    public TestCase(String path){
        this.path=path;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase("/home/");
        TestCase testCase2=new TestCase("/home//foo/");
        TestCase testCase3=new TestCase("/home/user/Documents/../Pictures");
        TestCase testCase4=new TestCase("/../");
        TestCase testCase5=new TestCase("/.../a/../b/c/../d/./");

        System.out.println("TestCase1 result: "+ (simplifyPath(testCase1.path)));
        System.out.println("TestCase2 result: "+ (simplifyPath(testCase2.path)));
        System.out.println("TestCase3 result: "+ (simplifyPath(testCase3.path)));
        System.out.println("TestCase3 result: "+ (simplifyPath(testCase4.path)));
        System.out.println("TestCase3 result: "+ (simplifyPath(testCase5.path)));

    }

    public static String simplifyPath(String path) {

        Stack<String> stack=new Stack<>();
        Stack<String> stack2=new Stack<>();

        for(int i=0;i<path.length();i++){
            int j=i;
            if(path.charAt(i)!='/'){
                StringBuffer str=new StringBuffer();

                while(j<path.length() && path.charAt(j)!='/'){
                    str.append(path.charAt(j));
                    j++;
                }

                String s = str.toString();

                if (s.equals("..")) {
                    if (!stack.isEmpty()) stack.pop();
                } else if (!s.equals(".")) {
                    stack.push(s);
                }

            }
            i=j;
        }

        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }


        StringBuffer result = new StringBuffer();

        result.append("/");

        while (!stack2.isEmpty()) {

            if(stack2.size()==1){
                result.append(stack2.pop());
                break;
            }

            result.append(stack2.pop());
            result.append("/");
        }

        return result.toString();

    }

}
