public class BiggerTwo {

    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumB > sumA) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = biggerTwo(new int[]{1, 2}, new int[]{3, 4});
        int[] result2 = biggerTwo(new int[]{3, 4}, new int[]{1, 2});
        int[] result3 = biggerTwo(new int[]{1, 1}, new int[]{1, 2});

        // Print results
        printArray(result1); // Output: [3, 4]
        printArray(result2); // Output: [3, 4]
        printArray(result3); // Output: [1, 2]
    }

    // Utility method to print arrays
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

