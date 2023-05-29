package Assignment_1;

import java.util.HashSet;
import java.util.Set;

public class FindErrorNums {

    public int[] findErrorNums(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int duplicate = 0;
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            if (numSet.contains(num)) {
                duplicate = num;
            }
            numSet.add(num);
            actualSum += num;
        }

        int missing = expectedSum - actualSum + duplicate;
        return new int[]{duplicate, missing};
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        FindErrorNums findErrorNums = new FindErrorNums();
        int[] result = findErrorNums.findErrorNums(nums);

        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");


    }
}
