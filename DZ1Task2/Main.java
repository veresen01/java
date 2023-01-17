package DZ1Task2;

public class Main {
    public static void main(String[] args) {

        Person ivan = new Person("Ivan", "No");
        Locker locker = new Locker("Close");

        // SearchKey ishem = new SearchKey(ivan, locker);
        // OpenLocker open = new OpenLocker(ivan, locker);

        // начальное сотояние
        System.out.println("Начальное состояние");
        System.out.println(ivan);
        System.out.println(locker);

        if ((ivan.getKey() == "Yes" || ivan.getKey() == "No") && locker.getStatus() == "Open") {
            System.out.println("Разуй глаза. Шкаф открыт");
        } else if (ivan.getKey() == "Yes" && locker.getStatus() == "Close") {
            // ключ есть, шкаф закрыт. запускаем метод openLocker() из класса Locker
            Locker.openLocker(ivan, locker);
            System.out.println(ivan);
            System.out.println(locker);
        } else if (ivan.getKey() == "No" && locker.getStatus() == "Close") {
            // ключа нет, шкаф закрыт
            // запускаем метод poisk() в класса Person, на поиск ключа
            Person.poisk(ivan, locker);
            // меняем статус ключа с No на Yes
            System.out.println(ivan);
            System.out.println(locker);

            // ключ есть, шкаф закрыт. запускаем метод openLocker() из класса Locker
            Locker.openLocker(ivan, locker);
            System.out.println(locker);

        }
    }
}