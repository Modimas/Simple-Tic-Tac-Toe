import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int max = 0;
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < len - 1; i++) {
            int maxx = array[i] * array[i + 1];
            if (maxx > max) {
                max = maxx;
            }
        }
        System.out.println(max);
    }
}