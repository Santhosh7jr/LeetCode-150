package ArraynSring.H_Index274_11;
import java.util.*;

class TestCase{
    int[] citations;
    public TestCase(int[] citations){
        this.citations=citations;
    }
}

public class Solution {
    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {3,0,6,1,5});
        TestCase testCase2=new TestCase(new int[] {1,3,1});

        System.out.println("TestCase1 Result: "+hIndex(testCase1.citations));
        System.out.println("TestCase2 Result: "+hIndex(testCase2.citations));

    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count=0;

        for(int i=1,j=citations.length-1;j>=0;i++,j--){
            if(citations[j]>=i) count++;
            else return count;
        }
        return count;
    }
}
