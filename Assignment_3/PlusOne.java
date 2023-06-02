package Assignment_3;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;

            if (sum < 10) {
                digits[i] = sum;
                carry = 0;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }



}
