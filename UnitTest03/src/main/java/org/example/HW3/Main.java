package org.example.HW3;

public class Main {
//    Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
//    переданное число четным или нечетным:

    public static boolean evenOddNumber(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

//    Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
//    переданное число в интервал (25;100)
    public static boolean numberInInterval(int n){
        return n > 24 && n < 101;
    }
}