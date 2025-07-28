public class Make2Array {

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        // Fill from array a first
        for (int i = 0; i < a.length && index < 2; i++) {
            result[index] = a[i];
            index++;
        }

        // Fill remaining from array b
        for (int i = 0; i < b.length && index < 2; i++) {
            result[index] = b[i];
            index++;
        }

        return result;
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
        printArray(make2(new int[] {4, 5}, new int[] {1, 2, 3})); // [4, 5]
        printArray(make2(new int[] {4}, new int[] {1, 2, 3}));    // [4, 1]
        printArray(make2(new int[] {}, new int[] {1, 2}));        // [1, 2]
    }
}

