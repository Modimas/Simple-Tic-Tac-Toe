import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();

        for (int i = 1; i <= bridgeCount; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (bridgeHeight > busHeight && i == bridgeCount) {
                System.out.println("Will not crash");
            }
        }
    }
}