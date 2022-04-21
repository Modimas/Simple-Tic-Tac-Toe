import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        if ("+".equals(operator)) {
            long result = num1 + num2;
            System.out.println(result);
        } else if ("-".equals(operator)) {
            long result = num1 - num2;
            System.out.println(result);
        } else if ("*".equals(operator)) {
            long result = num1 * num2;
            System.out.println(result);
        } else if ("/".equals(operator)) {
            if (num2 == 0) {
                System.out.println("Division by 0!");
            } else {
                long ressult = num1 / num2;
                System.out.println(ressult);
            }
        } else {
            System.out.println("Unknown operator");
        }
    }
}