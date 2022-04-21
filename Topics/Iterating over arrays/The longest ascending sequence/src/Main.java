import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < len - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else if (array[i] > array[i + 1]) {
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}