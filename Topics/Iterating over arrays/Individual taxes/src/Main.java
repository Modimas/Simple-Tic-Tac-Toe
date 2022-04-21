import java.util.*;

public class Main {
    public static final double HUNDRED = 100D;

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] income = new int[len];
        int[] taxes = new int[len];
        double[] compare = new double[len];
        for (int i = 0; i < len; i++) {
            income[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            taxes[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            compare[i] = income[i] * taxes[i] / HUNDRED;
        }
        double max = 0;
        for (int i = 0; i < len; i++) {
            if (compare[i] > max) {
                max = compare[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (compare[i] == max) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}