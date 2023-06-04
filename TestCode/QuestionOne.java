package TestCode;

import java.util.Arrays;

public class QuestionOne {

    static int[] moveZero(int[] nums) {

        int n = nums.length;
        int left = 0;


        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }


        while (left < n) {
            nums[left] = 0;
            left++;


        }
     return nums;
    }
        public static void main (String[]args){
             int [] a = {0,1,0,3,12};

            System.out.println(Arrays.toString(moveZero(a)));
        }

}
