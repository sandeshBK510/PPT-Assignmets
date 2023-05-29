package Assignment_1;

import java.util.Arrays;

public class MoveZeroes {

    public  void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                // Swap non-zero element with the element at the left pointer
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {


        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

        System.out.println("Result: " + Arrays.toString(nums));
    }
}
