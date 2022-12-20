// На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.

// Нужно реализовать алгоритм, не использовать метод equals.

/*
import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();

        ArrayList<Integer> array2 = new ArrayList<>();

        array1.add(5);

        array1.add(2);

        array1.add(1);

        array1.add(54);


        array2.add(5);

        array2.add(2);

        array2.add(1);

        array2.add(54);

        if (Comparison(array1, array2)) {

            System.out.println("Массивы равны.");

        } else {

            System.out.println("Массивы не равны.");

        }

    }


    public static boolean Comparison(ArrayList<Integer> array1, ArrayList<Integer> array2) {

        if (array1.size() != array2.size()) {

            return false;

        }

        for (int i = 0; i < array1.size(); i++) {

            if (array1.get(i) != array2.get(i)) {

                return false;

            }

        }

        return true;

    }

}
*/

// На вход методу приходят два ArrayList<Integer> и целое число num.

// Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.


/*
import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();

        ArrayList<Integer> array2 = new ArrayList<>();

        int num = 2;


        array1.add(5);

        array1.add(2);

        array1.add(1);

        array1.add(54);


        array2.add(5);

        array2.add(2);

        array2.add(1);

        array2.add(54);


        if (NumberOfMeetings(array1, array2, num)) {

            System.out.println(num + " встречается в обоих массивах одинаковое колличество раз.");

        } else {

            System.out.println(num + " встречается разное колличество раз в массивах.");

        }

    }


    public static boolean NumberOfMeetings(ArrayList<Integer> array1, ArrayList<Integer> array2, int num) {


        int count1 = 0;

        for (int i = 0; i < array1.size(); i++) {

            if (array1.get(i) == num) {

                count1++;

            }

        }


        int count2 = 0;

        for (int i = 0; i < array2.size(); i++) {

            if (array2.get(i) == num) {

                count2++;

            }

        }

        if (count1 == count2) {

            return true;

        }

        return false;

    }

}
*/

//На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа.

// Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]


/*
import java.util.ArrayList;

        import java.util.Collections;


public class task3 {

    public static void sortEven(ArrayList<Integer> arrayList1) {

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int elem : arrayList1) {

            if (elem % 2 == 0) {

                arrayList2.add(elem);

            }

        }

        Collections.sort(arrayList2);

        int j = 0;

        for (int i = 0; i < arrayList1.size(); i++) {

            if (arrayList1.get(i) % 2 == 0) {

                arrayList1.set(i, arrayList2.get(j++));

            }

        }

        System.out.println(arrayList1);

    }

}
*/

//На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)


/*
import java.util.*;


class Main4 {

    public static void main(String[] args) {

        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(500, 455, 657, 448, 311, 982, 747));

        System.out.println(removeEven(listOfNumbers));

    }


    public static ArrayList<Integer> removeEven(ArrayList<Integer> list) {

        list.removeIf(integer -> integer % 2 == 0);

        return list;

    }

}
*/
