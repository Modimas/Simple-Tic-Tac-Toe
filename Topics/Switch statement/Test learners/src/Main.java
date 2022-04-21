import java.util.Scanner;

class Main {
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int answer = scanner.nextInt();

        if (answer == 1) {
            System.out.println("Yes!");
        } else if (answer == TWO) {
            System.out.println("No!");
        } else if (answer == THREE) {
            System.out.println("No!");
        } else if (answer == FOUR) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }
    }
}