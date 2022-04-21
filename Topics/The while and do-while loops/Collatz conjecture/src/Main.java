import java.util.Scanner;

class Main {
    public static final int THRE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value = scanner.nextInt();
        System.out.print(value + " ");

        while (value != 1) {
            if (value % 2 != 0) {
                value = value * THRE + 1;
                System.out.print(value + " ");
            } else if (value % 2 == 0) {
                value = value / 2;
                System.out.print(value + " ");
            }
        }
    }
}