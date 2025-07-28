public class MiddleWay {

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public static void main(String[] args) {
        int[] result1 = middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int[] result2 = middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});
        int[] result3 = middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});

        System.out.println("middleWay([1, 2, 3], [4, 5, 6]) → [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("middleWay([7, 7, 7], [3, 8, 0]) → [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("middleWay([5, 2, 9], [1, 4, 5]) → [" + result3[0] + ", " + result3[1] + "]");
    }
}

