import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String harry = scanner.next();

        if ("gryffindor".equals(harry)) {
            System.out.println("bravery");
        } else if ("hufflepuff".equals(harry)) {
            System.out.println("loyalty");
        } else if ("slytherin".equals(harry)) {
            System.out.println("cunning");
        } else if ("ravenclaw".equals(harry)) {
            System.out.println("intellect");
        } else {
            System.out.println("not a valid house");
        }
    }
}