public class MakeMiddle {

    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[] { nums[mid - 1], nums[mid] };
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = makeMiddle(new int[]{1, 2, 3, 4});
        int[] result2 = makeMiddle(new int[]{7, 1, 2, 3, 4, 9});
        int[] result3 = makeMiddle(new int[]{1, 2});

        // Print results
        printArray(result1); // Output: [2, 3]
        printArray(result2); // Output: [2, 3]
        printArray(result3); // Output: [1, 2]
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

