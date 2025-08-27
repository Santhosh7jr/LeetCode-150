package Backtracking.Permutations46_03;
import java.util.*;

class TestCase {

    int[] nums;

    public TestCase(int[] nums) {
        this.nums = nums;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {1, 2, 3});
        TestCase testCase2 = new TestCase(new int[] {0, 1});
        TestCase testCase3 = new TestCase(new int[] {1});

        System.out.println("TestCase1 Result: " + permute(testCase1.nums));
        System.out.println("TestCase2 Result: " + permute(testCase2.nums));
        System.out.println("TestCase3 Result: " + permute(testCase3.nums));

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> numsList=new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        List<Integer> tempList=new ArrayList<>();
        return permutation(numsList,tempList,list);
    }
    private static List<List<Integer>> permutation(List<Integer> numsList, List<Integer> tempList, List<List<Integer>> list) {
        if (tempList.size() == numsList.size()) {
            list.add(new ArrayList<>(tempList));
            return list;
        }
        for (int i = 0; i < numsList.size(); i++) {
            if (tempList.contains(numsList.get(i))) {
                continue;
            }
            tempList.add(numsList.get(i));
            permutation(numsList, tempList, list);
            tempList.removeLast();
        }
        return list;
    }

}
