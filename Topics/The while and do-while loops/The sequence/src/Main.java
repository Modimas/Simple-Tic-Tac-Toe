import java.util.Scanner;

class Main {
    public static final int FOUR = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int n = scanner.nextInt();
        int count = 1;

        while (scanner.hasNext() && count <= n) {
            int userInput = scanner.nextInt();
            if (userInput % FOUR == 0 && userInput > sum) {
                sum = userInput;

                count++;
            }
        }
        System.out.println(sum);
    }
}