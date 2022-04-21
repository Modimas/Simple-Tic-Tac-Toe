import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        String[] origArray = array.clone();

        int shiftBy = scanner.nextInt() % array.length;

        for (int i = 0; i < array.length; i++) {
            if (i + 1 <= shiftBy) {
                array[i] = origArray[origArray.length - shiftBy + i];
            } else {
                array[i] = origArray[i - shiftBy];
            }

            System.out.print(array[i] + " ");
        }
    }
}