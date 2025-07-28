public class SwapEnds {

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        // Test cases
        printArray(swapEnds(new int[]{1, 2, 3, 4}));    // [4, 2, 3, 1]
        printArray(swapEnds(new int[]{1, 2, 3}));       // [3, 2, 1]
        printArray(swapEnds(new int[]{8, 6, 7, 9, 5})); // [5, 6, 7, 9, 8]
    }

    // Helper method to print arrays
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

