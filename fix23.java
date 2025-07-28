import java.util.Arrays;

public class Fix23 {

    public static int[] fix23(int[] nums) {
        if (nums.length == 3) {
            if (nums[0] == 2 && nums[1] == 3) {
                nums[1] = 0;
            }
            if (nums[1] == 2 && nums[2] == 3) {
                nums[2] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(new int[]{1, 2, 3}))); // [1, 2, 0]
        System.out.println(Arrays.toString(fix23(new int[]{2, 3, 5}))); // [2, 0, 5]
        System.out.println(Arrays.toString(fix23(new int[]{1, 2, 1}))); // [1, 2, 1]
        System.out.println(Arrays.toString(fix23(new int[]{2, 3, 3}))); // [2, 0, 3]
    }
}

