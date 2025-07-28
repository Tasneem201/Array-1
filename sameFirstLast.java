public class SameFirstLast {

    public static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));      // false
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));   // true
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));      // true
    }
}

