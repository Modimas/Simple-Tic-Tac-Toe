import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int len = scanner.nextInt();
        int[] array = new int[len];
        int[] array2 = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            if (i + 1 <= 1) {
                array2[i] = array[len - 1 + i];
            } else {
                array2[i] = array[i - 1];
            }
            System.out.print(array2[i] + " ");
        }
    }
}