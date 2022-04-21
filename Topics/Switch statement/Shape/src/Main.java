import java.util.Scanner;

class Main {
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int shape = scanner.nextInt();

        if (shape == 1) {
            System.out.println("You have chosen a square");
        } else if (shape == TWO) {
            System.out.println("You have chosen a circle");
        } else if (shape == THREE) {
            System.out.println("You have chosen a triangle");
        } else if (shape == FOUR) {
            System.out.println("You have chosen a rhombus");
        } else {
            System.out.println("There is no such shape!");
        }
    }
}
