import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int[] array2 = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        System.arraycopy(array, 0, array2, 0, len);
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array, array2));
    }
}