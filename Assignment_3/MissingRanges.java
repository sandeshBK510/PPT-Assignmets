package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {


    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int start = lower;

        for (int num : nums) {
            if (num == start) {
                start++;
            } else if (num > start) {
                result.add(getRange(start, num - 1));
                start = num + 1;
            }
        }

        if (start <= upper) {
            result.add(getRange(start, upper));
        }

        return result;
    }

    private static String getRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println(missingRanges);
    }



}
