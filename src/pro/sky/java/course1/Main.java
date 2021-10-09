package pro.sky.java.course1;

public class Main {


    public static void main(String[] args) {
        Author author = new Author("Leo", "Tolstoy");
        Author author1 = new Author("Victor", "Hugo");

        Book book = new Book("War and peace", "Leo Tolstoy", 1862);

        book.setYearOfPublication(1869);

        printBook(book);


        book = new Book("Notre-Dame de Paris", "Victor Hugo", 1831);

        printBook(book);

    }

    private static void printBook(Book book) {
        System.out.println(book.getAuthorName() + ":" + book.getNameBook() + ":" + book.getYearOfPublication());
    }
}

