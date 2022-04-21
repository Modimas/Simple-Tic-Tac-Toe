import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int collum = scanner.nextInt();
        int[][] matrix = new int[row][collum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            int temp = matrix[i][n];
            matrix[i][n] = matrix[i][m];
            matrix[i][m] = temp;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}