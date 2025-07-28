public class CommonEnd {

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {7, 3};
        System.out.println("commonEnd([1, 2, 3], [7, 3]) → " + commonEnd(a1, b1)); // true

        int[] a2 = {1, 2, 3};
        int[] b2 = {7, 3, 2};
        System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) → " + commonEnd(a2, b2)); // false

        int[] a3 = {1, 2, 3};
        int[] b3 = {1, 3};
        System.out.println("commonEnd([1, 2, 3], [1, 3]) → " + commonEnd(a3, b3)); // true
    }
}

