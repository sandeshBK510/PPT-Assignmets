package Assignment_2;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {


    public static int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        // Check for harmonious subsequences
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int currentLen = countMap.get(num) + countMap.get(num + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println("Length of longest harmonious subsequence: " + result);
    }
}
