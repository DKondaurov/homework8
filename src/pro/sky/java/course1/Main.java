package pro.sky.java.course1;

public class Main {


    public static void main(String[] args) {
        Author author = new Author("Leo", "Tolstoy");

        Book book = new Book("War and peace", author, 1862);

        book.setYearOfPublication(1869);

        printBook(book);

        author = new Author("Victor", "Hugo");

        book = new Book("Notre-Dame de Paris", author, 1831);

        printBook(book);

    }

    private static void printBook(Book book) {
        System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getSurname() + ":" + book.getNameBook() + ":" + book.getYearOfPublication());
    }
}

