package Assignment_1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }

        return false;
    }



    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.containsDuplicate(nums);

        System.out.println("Result: " + result);

    }
}
