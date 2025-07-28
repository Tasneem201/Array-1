public class MakePi {

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static void main(String[] args) {
        int[] result = makePi();
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

