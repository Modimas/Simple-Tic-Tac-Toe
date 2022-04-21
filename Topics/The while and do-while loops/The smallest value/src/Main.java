import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long m = scanner.nextLong();
        long n = 1L;
        int num = 1;

        while (n <= m) {
            if (n <= m) {
                n *= num;
                num++;
            }
        }
        System.out.println(num - 1);
    }
}