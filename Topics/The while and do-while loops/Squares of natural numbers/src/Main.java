import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}