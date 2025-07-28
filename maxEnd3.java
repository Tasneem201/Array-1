public class MaxEnd3 {

    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
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
        int[] test2 = {11, 5, 9};
        int[] test3 = {2, 11, 3};

        System.out.print("maxEnd3([1, 2, 3]) → ");
        printArray(maxEnd3(test1));

        System.out.print("maxEnd3([11, 5, 9]) → ");
        printArray(maxEnd3(test2));

        System.out.print("maxEnd3([2, 11, 3]) → ");
        printArray(maxEnd3(test3));
    }
}

