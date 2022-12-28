class Reader {
    private String fio;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String telephone;


    public Reader(String fio, int ticketNumber, String faculty, String birthDate, String telephone) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", faculty='" + faculty + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", telephone='" + telephone + '\'' +
                "}\n";
    }

    public void takeBook() {
    }

    public void returnBook() {
    }


    public void takeBook(int countBooks) {
        String endBooks;
        if (countBooks % 100 > 4 && countBooks % 100 < 21) {
            endBooks = "книг";
        } else if (countBooks % 10 == 1) {
            endBooks = "книгу";
        } else if (countBooks % 10 > 1 && countBooks % 10 < 5) {
            endBooks = "книги";
        } else {
            endBooks = "книг";
        }
        System.out.printf("%s взял %d %s", this.fio, countBooks, endBooks);
    }


    public void takeBook(String... nameBooks) {
        StringBuilder books = new StringBuilder();
        for (String nameBook : nameBooks) {
            books.append(nameBook + ", ");
        }
        books.setLength(books.length() - 2);
        System.out.print(this.fio + " взял книги: " + books);
    }


    public void takeBook(Book... books) {
        StringBuilder stringBook = new StringBuilder();
        for (Book book : books) {
            stringBook.append(book + ", ");
        }
        stringBook.setLength(stringBook.length() - 2);
        System.out.print(this.fio + " взял книги: " + stringBook);
    }

    public void returnBook(Book... books) {
        StringBuilder stringBook = new StringBuilder();
        for (Book book : books) {
            stringBook.append(book + ", ");
        }
        stringBook.setLength(stringBook.length() - 2);
        System.out.print(this.fio + " вернул книги: " + stringBook);
    }
}
