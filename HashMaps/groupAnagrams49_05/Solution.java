package HashMaps.groupAnagrams49_05;
import java.util.*;

class TestCase{
    String[] strs;

    public TestCase(String[] strs){
        this.strs=strs;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new String[] {"eat","tea","tan","ate","nat","bat"});
        TestCase testCase2=new TestCase(new String[] {""});
        TestCase testCase3=new TestCase(new String[] {"a"});

        System.out.println("TestCase1 result: "+groupAnagrams(testCase1.strs));
        System.out.println("TestCase2 result: "+groupAnagrams(testCase2.strs));
        System.out.println("TestCase3 result: "+groupAnagrams(testCase3.strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());
    }

}
