import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] star = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = '.';
                if (i == j || i + j == n - 1 || j == n / 2 || i == n / 2) {
                    star[i][j] = '*';
                }
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }
    }
}