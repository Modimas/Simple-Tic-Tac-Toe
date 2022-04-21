import java.util.Scanner;

class Main {
    public static final int THOUS = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            sum += a;
            if (sum >= THOUS) {
                System.out.println(sum - THOUS);
                break;
            } else if (a == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}