package Assignment_1;

public class RemoveElement {


    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {


        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement removeElement = new RemoveElement();
        int result = removeElement.removeElement(nums, val);

        System.out.println("Result: " + result);
        System.out.print("Modified Array: [");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
            if (i != result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
