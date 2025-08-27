package Backtracking.Combinations77_02;
import java.util.*;

class TestCase {

    int n;
    int k;

    public TestCase(int n, int k) {
        this.n = n;
        this.k = k;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(4,2);
        TestCase testCase2 = new TestCase(1,1);

        System.out.println("TestCase1 Result: " + combine(testCase1.n,testCase1.k));
        System.out.println("TestCase2 Result: " + combine(testCase2.n,testCase2.k));

    }

    public static List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }

        return getCombinations(arr,k,0,new ArrayList<>(),new ArrayList<>());

    }

    private static List<List<Integer>> getCombinations(int arr[],int k,int idx,List<List<Integer>> list,List<Integer> temp){

        if(temp.size()==k){
            list.add(new ArrayList<>(temp));
            return list;
        }

        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            getCombinations(arr,k,i+1,list,temp);
            temp.removeLast();
        }

        return list;

    }

}
