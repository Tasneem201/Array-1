public class MidThree {

    public static int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[] { nums[mid - 1], nums[mid], nums[mid + 1] };
    }

    public static void main(String[] args) {
        int[] result1 = midThree(new int[] {1, 2, 3, 4, 5});        // [2, 3, 4]
        int[] result2 = midThree(new int[] {8, 6, 7, 5, 3, 0, 9});  // [7, 5, 3]
        int[] result3 = midThree(new int[] {1, 2, 3});              // [1, 2, 3]
    }
}

