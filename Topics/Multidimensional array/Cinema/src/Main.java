import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] cinema = new int[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int tickets = scanner.nextInt();
        int count = 0;
        int row = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                    if (count == tickets) {
                        row = i + 1;
                        break;
                    }
                }
                if (cinema[i][j] == 1) {
                    count = 0;
                }
            }
            if (count == tickets) {
                break;
            }
            count = 0;
        }
        System.out.println(row);
    }
}