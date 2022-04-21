import java.util.Scanner;

class Main {
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;

    public static void main(String[] args) {
        // start coding here
        Scanner scanner = new Scanner(System.in);

        int direction = scanner.nextInt();

        if (direction == 1) {
            System.out.println("move up");
        } else if (direction == TWO) {
            System.out.println("move down");
        } else if (direction == THREE) {
            System.out.println("move left");
        } else if (direction == FOUR) {
            System.out.println("move right");
        } else if (direction == 0) {
            System.out.println("do not move");
        } else {
            System.out.println("error!");
        }
    }
}