package DZ6Task1;

import java.util.Scanner;


public class Program {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        methodChoice a = new methodChoice();
        operationChoice b = new operationChoice();

        b.choiceOperation(a.choice(), b.getOperation());
    }
}