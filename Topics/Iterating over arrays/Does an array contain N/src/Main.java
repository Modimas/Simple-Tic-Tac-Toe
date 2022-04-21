import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        boolean broke = false;
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            if (array[i] == n) {
                broke = true;
                break;
            }
        }
        if (broke) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}