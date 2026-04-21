package ArraynSring.gasStation134_14;

class TestCase{
    int gas[];
    int cost[];
    public TestCase(int[] gas, int[] cost){
        this.gas = gas;
        this.cost = cost;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(new int[]{1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2});
        TestCase testCase2 = new TestCase(new int[]{2,3,4}, new int[] {3, 4, 3});

        System.out.println("TestCase1 Result: " + canCompleteCircuit(testCase1.gas, testCase1.cost));

        System.out.println("TestCase2 Result: " + canCompleteCircuit(testCase2.gas, testCase1.cost));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) return -1;

        int start = 0;
        int gasRem = 0;
        int idx = 0;

        while (idx < gas.length) {

            gasRem += (gas[idx] - cost[idx]);

            idx++;

            if (gasRem < 0) {
                start = idx;
                gasRem = 0;
            }

        }

        return start;

    }

}