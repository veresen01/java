package DZ6Task1;

import java.util.Scanner;

public class operationChoice {
    Scanner sc = new Scanner(System.in);

    public char getOperation() {
        System.out.println("Введите операцию: ");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе числа");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }

    public void choiceOperation (int choice, char operation){
        if (choice == 1){
            switch (operation) {
                case '+': {
                    PresenterInt p = new PresenterInt(new SumModelInt(), new View());
                    p.buttonClick();
                    break;
                }
                case '-': {
                    PresenterInt p = new PresenterInt(new DifModelInt(), new View());
                    p.buttonClick();
                    break;
                }
                case '*': {
                    PresenterInt p = new PresenterInt(new MultModelInt(), new View());
                    p.buttonClick();
                    break;
                }
                case '/': {
                    PresenterInt p = new PresenterInt(new DivModelInt(), new View());
                    p.buttonClick();
                    break;
                }
                default: {
                    System.out.println("Операция не распознана");
                }
            }
        }

        if (choice == 2){
            switch (operation) {
                case '+': {
                    PresenterRac p = new PresenterRac(new SumModelRac(), new View());
                    p.buttonClick();
                    break;
                }
                case '-': {
                    PresenterRac p = new PresenterRac(new DifModelRac(), new View());
                    p.buttonClick();
                    break;
                }
                case '*': {
                    PresenterRac p = new PresenterRac(new MultModelRac(), new View());
                    p.buttonClick();
                    break;
                }
                case '/': {
                    PresenterRac p = new PresenterRac(new DivModelRac(), new View());
                    p.buttonClick();
                    break;
                }
                default: {
                    System.out.println("Операция не распознана");
                }
            }
        }
    }
}