package Backtracking.combinationSum39_04;
import java.util.*;

class TestCase {

    int[] candidates;
    int target;

    public TestCase(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {2,3,6,7},7);
        TestCase testCase2 = new TestCase(new int[] {2,3,5},8);
        TestCase testCase3 = new TestCase(new int[] {2},1);

        System.out.println("TestCase1 Result: " + combinationSum(testCase1.candidates,testCase1.target));
        System.out.println("TestCase2 Result: " + combinationSum(testCase2.candidates,testCase2.target));
        System.out.println("TestCase3 Result: " + combinationSum(testCase3.candidates,testCase3.target));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        getResult(candidates,0,target,list,temp);

        return list;
    }

    private static void getResult(int arr[],int idx,int target,List<List<Integer>> list,List<Integer> temp){
        if(idx==arr.length){
            if(target==0) list.add(new ArrayList<>(temp));
            return;
        }

        if(arr[idx]<=target){
            temp.add(arr[idx]);
            getResult(arr,idx,target-arr[idx],list,temp);
            temp.removeLast();
        }

        getResult(arr,idx+1,target,list,temp);
    }

}
