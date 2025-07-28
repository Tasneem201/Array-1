public class Front11 {

    public static int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        printArray(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));  // [1, 7]
        printArray(front11(new int[]{1}, new int[]{2}));              // [1, 2]
        printArray(front11(new int[]{1, 7}, new int[]{}));            // [1]
        printArray(front11(new int[]{}, new int[]{}));                // []
    }
}

