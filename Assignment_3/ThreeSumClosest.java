package Assignment_3;

import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }

                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--;
                } else {
                    return target;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int closestSum = threeSumClosest(nums, target);
        System.out.println(closestSum);
    }

}
