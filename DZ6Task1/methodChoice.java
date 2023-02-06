package DZ6Task1;

import java.util.Scanner;

public class methodChoice {

    Scanner sc = new Scanner(System.in);

    public int choice() {

        System.out.println("Введите желаемое действие: \n 1. Работа с целыми числами \n 2. Работа с дробными числами");
        int choice;

        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа");
            sc.next();
            choice = choice();
        }
        return choice;
    }
}