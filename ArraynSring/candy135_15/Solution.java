package ArraynSring.candy135_15;

class TestCase{
    int[] ratings;
    public TestCase(int[] ratings){
        this.ratings = ratings;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(new int[]{1, 0, 2});
        TestCase testCase2 = new TestCase(new int[]{1, 2, 2});

        System.out.println("TestCase1 Result: " + candy(testCase1.ratings));

        System.out.println("TestCase2 Result: " + candy(testCase2.ratings));

    }

    public static int candy(int[] ratings) {

        int len = ratings.length;

        int[] left = new int[len];
        int[] right = new int[len];

        int result = 0;

        left[0] = 1;
        int leftVal = 1;

        for (int i = 1; i < len ; i++) {

            if (ratings[i] > ratings[i - 1]) {
                leftVal++;
            }

            if (ratings[i] <= ratings[i - 1]) {
                leftVal = 1;
            }

            left[i] = leftVal;

        }

        right[len - 1] = 1;
        int rightVal = 1;

        for (int i = len - 2; i >= 0 ; i--) {

            if (ratings[i] > ratings[i + 1]) {
                rightVal++;
            }

            if (ratings[i] <= ratings[i + 1]) {
                rightVal = 1;
            }

            right[i] = rightVal;

        }

        for (int i = 0; i < len; i++) result += Math.max(left[i], right[i]);

        return result;

    }

}