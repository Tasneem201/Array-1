public class Sum3 {

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println("sum3([1, 2, 3]) → " + sum3(arr1)); // 6

        int[] arr2 = {5, 11, 2};
        System.out.println("sum3([5, 11, 2]) → " + sum3(arr2)); // 18

        int[] arr3 = {7, 0, 0};
        System.out.println("sum3([7, 0, 0]) → " + sum3(arr3)); // 7
    }
}

