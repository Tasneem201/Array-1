public class MakeEnds {

    public static int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        int[] result1 = makeEnds(new int[]{1, 2, 3});
        int[] result2 = makeEnds(new int[]{1, 2, 3, 4});
        int[] result3 = makeEnds(new int[]{7, 4, 6, 2});

        System.out.println("makeEnds([1, 2, 3]) → [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("makeEnds([1, 2, 3, 4]) → [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("makeEnds([7, 4, 6, 2]) → [" + result3[0] + ", " + result3[1] + "]");
    }
}

