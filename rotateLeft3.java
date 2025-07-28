public class RotateLeft3 {

    public static int[] rotateLeft3(int[] nums) {
        // Shift elements left and move first to the end
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {5, 11, 9};
        int[] test3 = {7, 0, 0};

        System.out.print("rotateLeft3([1, 2, 3]) → ");
        printArray(rotateLeft3(test1));

        System.out.print("rotateLeft3([5, 11, 9]) → ");
        printArray(rotateLeft3(test2));

        System.out.print("rotateLeft3([7, 0, 0]) → ");
        printArray(rotateLeft3(test3));
    }
}

