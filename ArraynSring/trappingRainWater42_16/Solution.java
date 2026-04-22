package ArraynSring.trappingRainWater42_16;

class TestCase{
    int[] height;
    public TestCase(int[] height){
        this.height = height;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        TestCase testCase2 = new TestCase(new int[]{4, 2, 0, 3, 2, 5});

        System.out.println("TestCase1 Result: " + trap(testCase1.height));

        System.out.println("TestCase2 Result: " + trap(testCase2.height));

    }

    public static int trap(int[] height) {

        int len = height.length;
        int[] prefMax = new int[len];
        int[] sufMax = new int[len];
        int total = 0;

        prefMax[0] = height[0];
        sufMax[len - 1] = height[len - 1];

        for (int i = 1, j = len - 2; i < len; i++, j--) {
            prefMax[i] = Math.max(prefMax[i - 1], height[i]);
            sufMax[j] = Math.max(sufMax[j + 1], height[j]);
        }

        for (int i = 0; i < len; i++) {

            if (height[i] < prefMax[i] && height[i] < sufMax[i]) {
                total += Math.min(prefMax[i], sufMax[i]) - height[i];
            }

        }

        return total;

    }

}