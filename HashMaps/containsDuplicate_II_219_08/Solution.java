package HashMaps.containsDuplicate_II_219_08;
import java.util.*;

class TestCase{
    int[] nums;
    int k;

    public TestCase(int[] nums,int k){
        this.nums=nums;
        this.k=k;
    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {1,2,3,1},3);
        TestCase testCase2=new TestCase(new int[] {1,0,1,1},1);
        TestCase testCase3=new TestCase(new int[] {1,2,3,1,2,3},2);

        System.out.println("TestCase1 result: "+ (containsNearbyDuplicate(testCase1.nums, testCase1.k)));
        System.out.println("TestCase2 result: "+ (containsNearbyDuplicate(testCase2.nums, testCase2.k)));
        System.out.println("TestCase3 result: "+ (containsNearbyDuplicate(testCase3.nums, testCase3.k)));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                if((Math.abs(i-map.get(nums[i]))<=k)) return true;
                else map.put(nums[i],i);
            }
        }
        return false;
    }

}
