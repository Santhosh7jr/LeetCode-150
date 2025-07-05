package ArraynSring.removeDuplicatesFromSortedArray03;
import java.util.*;

class TestCase{
    int nums[];
    public TestCase(int nums[]){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {1,1,2});
        TestCase testCase2=new TestCase(new int[] {0,0,1,1,1,2,2,3,3,4});

        int testCase1Result=removeDuplicates(testCase1.nums);
        int testCase2Result=removeDuplicates(testCase2.nums);

        System.out.println("TestCase1 Result: "+testCase1Result+" & "+ Arrays.toString(Arrays.copyOfRange(testCase1.nums,0,testCase1Result)));
        System.out.println("TestCase2 Result: "+testCase2Result+" & "+ Arrays.toString(Arrays.copyOfRange(testCase2.nums,0,testCase2Result)));

    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        Iterator<Integer> it=set.iterator();

        while(it.hasNext()){
            list.add(it.next());
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }

}
