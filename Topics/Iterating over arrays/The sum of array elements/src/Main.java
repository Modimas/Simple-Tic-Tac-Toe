import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int b = scanner.nextInt();
            sum += b;
        }
        System.out.println(sum);
    }
}