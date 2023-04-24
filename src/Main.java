import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Throwable{
        String[][] arr1 = new String[][] {{"4", "2", "2", "4", "3"}, {"3", "4", "6", "2", "1"}};
        int[] arr2 = new int[] {2, 5};
        int[] arr3 = new int[] {3, 5};

                /* Реализуйте 3 метода, чтобы в каждом из них получить
        разные исключения */

        int numErr1 = 0;
        do{
            numErr1 = ChekMassive.chekLength2Massive(arr1); // проверка на длину
            if(numErr1 == -2){
                System.out.println("Ошибка: Количество чисел в подмассиве меньше 5");
                break;
            }

            numErr1 = ChekMassive.chekStr2d(arr1); // проверка на null
            if(numErr1 == -1){
                System.out.println("Ошибка: В массиве содержится null или пустая строка");
                break;
            }

            try{
                numErr1 = SumMassive.sum2d(arr1); // Если не возможно преобразовать в число
                System.out.println(numErr1);
                numErr1 = 0;
            }catch (Throwable t){
                System.out.println("Ошибка: в массиве не число");
            }

        }while(numErr1 != 0);

                /* Реализуйте метод, принимающий в качестве аргументов
        два целочисленных массива, и возвращающий
        новый массив, каждый элемент которого равен
        разности элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны, необходимо
        как-то оповестить пользователя. */

        int[] arr4 = SumMassive.diff2massiv(arr2, arr3);
        System.out.println(Arrays.toString(arr4));

                /* * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих
        массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
        */

        double[] arr5 = SumMassive.div2massiv(arr2, arr3);
        System.out.println(Arrays.toString(arr5));

    }
}