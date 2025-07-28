public class FrontPiece {

    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[] { nums[0], nums[1] };
        } else if (nums.length == 1) {
            return new int[] { nums[0] };
        } else {
            return new int[] {}; // empty array
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
        printArray(frontPiece(new int[] {1, 2, 3}));  // [1, 2]
        printArray(frontPiece(new int[] {1, 2}));      // [1, 2]
        printArray(frontPiece(new int[] {1}));         // [1]
        printArray(frontPiece(new int[] {}));          // []
    }
}

