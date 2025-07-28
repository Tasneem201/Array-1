public class PlusTwo {

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[] { a[0], a[1], b[0], b[1] };
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = plusTwo(new int[]{1, 2}, new int[]{3, 4});
        int[] result2 = plusTwo(new int[]{4, 4}, new int[]{2, 2});
        int[] result3 = plusTwo(new int[]{9, 2}, new int[]{3, 4});

        // Print results
        printArray(result1); // [1, 2, 3, 4]
        printArray(result2); // [4, 4, 2, 2]
        printArray(result3); // [9, 2, 3, 4]
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

