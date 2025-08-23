package TwoPointers.containerWithMostWater11_04;
import java.util.*;

class TestCase {

    int[] height;

    public TestCase(int[] height) {

        this.height = height;

    }

}

public class Solution {

    public static void main(String[] args) {

        TestCase testCase1 = new TestCase(new int[] {1,8,6,2,5,4,8,3,7});
        TestCase testCase2 = new TestCase(new int[] {1,1});

        System.out.println("TestCase1 Result: " + maxArea(testCase1.height));
        System.out.println("TestCase2 Result: " + maxArea(testCase2.height));

    }

    public static int maxArea(int[] height) {
        int max=0;

        int left=0;
        int right=height.length-1;

        while(left<right){
            int width=right-left;
            max=Math.max(max,Math.min(height[left],height[right])*width);

            if(height[left]<height[right]) left++;
            else right--;

        }

        return max;
    }

}
