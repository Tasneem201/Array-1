public class MaxTriple {

    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(middle, last));
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[] {1, 2, 3}));     // 3
        System.out.println(maxTriple(new int[] {1, 5, 3}));     // 5
        System.out.println(maxTriple(new int[] {5, 2, 3}));     // 5
    }
}

