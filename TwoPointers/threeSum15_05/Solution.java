package TwoPointers.threeSum15_05;
import java.util.*;

class TestCase{
    int[] nums;
    public TestCase(int[] nums){
        this.nums=nums;
    }
}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1=new TestCase(new int[] {-1,0,1,2,-1,-4});
        TestCase testCase2=new TestCase(new int[] {0,1,1});
        TestCase testCase3=new TestCase(new int[] {0,0,0});

        System.out.println("TestCase1 Result: "+threeSum(testCase1.nums));
        System.out.println("TestCase2 Result: "+threeSum(testCase2.nums));
        System.out.println("TestCase3 Result: "+threeSum(testCase3.nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> st=new HashSet<>();

        for(int i=0;i<nums.length;i++){

            Set<Integer> hashset = new HashSet<>();

            for(int j=i+1;j<nums.length;j++){

                int third = -(nums[i] + nums[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }

                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

}
