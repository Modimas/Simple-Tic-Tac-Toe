import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int triples = 0;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < len - 1; i++) {
            if (array[i] - array[i - 1] == 1 && array[i + 1] - array[i] == 1) {
                triples++;
            }
        }
        System.out.println(triples);
    }
}