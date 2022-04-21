import java.util.*;

public class Main {
    public static final int THRE = 3;

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[THRE];
        int[] b = new int[THRE];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int j = 0; j < b.length; j++) {
            b[j] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if (a[0] < b[0] && a[1] < b[1] && a[2] < b[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (b[0] < a[0] && b[1] < a[1] && b[2] < a[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}