public class Double23 {

    public static boolean double23(int[] nums) {
        return (nums.length == 2) &&
               ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

    public static void main(String[] args) {
        System.out.println(double23(new int[]{2, 2}));  // → true
        System.out.println(double23(new int[]{3, 3}));  // → true
        System.out.println(double23(new int[]{2, 3}));  // → false
        System.out.println(double23(new int[]{3}));     // → false
        System.out.println(double23(new int[]{}));      // → false
    }
}

