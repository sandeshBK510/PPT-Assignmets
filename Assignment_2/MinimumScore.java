package Assignment_2;

public class MinimumScore {

    public static int minimumScore(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        if (maxVal - minVal <= 2 * k) {
            return 0;
        }

        maxVal -= k;
        minVal += k;

        if (maxVal < minVal) {
            int temp = maxVal;
            maxVal = minVal;
            minVal = temp;
        }

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minimumScore(nums, k);
        System.out.println("score: " + result);
    }

}
