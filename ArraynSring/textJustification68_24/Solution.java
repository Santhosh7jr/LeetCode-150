package ArraynSring.textJustification68_24;
import java.util.*;

class TestCase{
    String[] words;
    int maxWidth;
    public TestCase(String[] words, int maxWidth){
        this.words = words;
        this.maxWidth = maxWidth;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        TestCase testCase2 = new TestCase(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16);
        TestCase testCase3 = new TestCase(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20);

        System.out.println("TestCase1 Result: " + fullJustify(testCase1.words, testCase1.maxWidth));

        System.out.println("TestCase2 Result: " + fullJustify(testCase2.words, testCase2.maxWidth));

        System.out.println("TestCase3 Result: " + fullJustify(testCase3.words, testCase3.maxWidth));

    }

    public static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int len = 0;
        int i = 0;

        while (i < words.length) {

            if (len + temp.size() + words[i].length() > maxWidth) {

                int remaining = maxWidth - len;
                int gaps = Math.max(1, temp.size() - 1);
                int spaces = remaining / gaps;
                int rem = remaining % gaps;

                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < temp.size() - 1; j++) {
                    sb.append(temp.get(j));
                    sb.append(" ".repeat(spaces));

                    if (rem > 0) {
                        sb.append(" ");
                        rem--;
                    }
                }

                sb.append(temp.get(temp.size() - 1));

                if (temp.size() == 1) {
                    sb.append(" ".repeat(remaining));
                }

                result.add(sb.toString());
                temp.clear();
                len = 0;
            }

            temp.add(words[i]);
            len += words[i].length();
            i++;
        }

        StringBuilder last = new StringBuilder();
        last.append(String.join(" ", temp));

        int space = maxWidth - last.length();
        last.append(" ".repeat(space));

        result.add(last.toString());

        return result;
    }
}