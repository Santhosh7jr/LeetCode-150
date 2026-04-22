package ArraynSring.integerToRoman12_18;

class TestCase{
    int num;
    public TestCase(int num){
        this.num = num;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(3749);
        TestCase testCase2 = new TestCase(58);
        TestCase testCase3 = new TestCase(1994);

        System.out.println("TestCase1 Result: " + intToRoman(testCase1.num));

        System.out.println("TestCase2 Result: " + intToRoman(testCase2.num));

        System.out.println("TestCase3 Result: " + intToRoman(testCase3.num));

    }

    public static String intToRoman(int num) {

        StringBuffer sb = new StringBuffer();

        while(num > 0) {

            if (num >= 1000) {
                sb.append("M");
                num -= 1000;
            } else if (num >= 900) {
                sb.append("CM");
                num -= 900;
            } else if (num >= 500) {
                sb.append("D");
                num -= 500;
            } else if (num >= 400) {
                sb.append("CD");
                num -= 400;
            } else if (num >= 100) {
                sb.append("C");
                num -= 100;
            } else if (num >= 90) {
                sb.append("XC");
                num -= 90;
            } else if (num >= 50) {
                sb.append("L");
                num -= 50;
            } else if (num >= 40) {
                sb.append("XL");
                num -= 40;
            } else if (num >= 10) {
                sb.append("X");
                num -= 10;
            } else if (num >= 9) {
                sb.append("IX");
                num -= 9;
            } else if (num >= 5) {
                sb.append("V");
                num -= 5;
            } else if (num >= 4) {
                sb.append("IV");
                num -= 4;
            } else if (num >= 1) {
                sb.append("I");
                num -= 1;
            }

        }

        return sb.toString();

    }

}