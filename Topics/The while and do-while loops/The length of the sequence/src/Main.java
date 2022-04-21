import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        int value;

        while (scanner.hasNextInt()) {
            value = scanner.nextInt();
            if (value != 0) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}