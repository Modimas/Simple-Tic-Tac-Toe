import java.util.Scanner;

class Main {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.next();

        if ("triangle".equals(shape)) {
            double a = scanner.nextInt();
            double b = scanner.nextInt();
            double c = scanner.nextInt();

            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(area);
        } else if ("rectangle".equals(shape)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int area = a * b;
            System.out.println(area);
        } else if ("circle".equals(shape)) {
            int r = scanner.nextInt();
            double area = PI * r * r;
            System.out.println(area);
        }
    }
}