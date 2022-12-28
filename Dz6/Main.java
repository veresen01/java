import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader user1 = new Reader("Иванов И.И.", 563, "Информатика", "10.06.2006", "+79215689436");
        Reader user2 = new Reader("Петров В.В.", 654, "Информатика", "28.17.1993", "+79115623478");
        System.out.println(getArrayObj(user1, user2));

        user1.takeBook(20);
        System.out.println();

        user1.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        Book book3 = new Book("Энциклопедия");

        System.out.println();
        user2.takeBook(book1, book2, book3);
        System.out.println();
        user2.returnBook(book1,book2,book3);

    }

    public static ArrayList getArrayObj(Reader... users) {
        List<Reader> arrayObj = new ArrayList<>();
        for (Reader user : users) {
            arrayObj.add(user);
        }
        return (ArrayList) arrayObj;
    }
}