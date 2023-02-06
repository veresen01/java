package DZ6Task1;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public char getOperation(char title) {
        System.out.printf("%s", title);
        return in.next().charAt(0);
    }

    public void printInt(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public void printRac(String data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}