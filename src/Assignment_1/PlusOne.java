package Assignment_1;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }
        }

        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }
    public static void main(String[] args) {

        int[] digits = {1, 2, 3};

        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(digits);

        System.out.println("Result: " + Arrays.toString(result)); // Output: [1, 2, 4]

    }
}
