package pro.sky.java.course1;

public class Book {
    private final String nameBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.nameBook = name;
        this.author =author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {

        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

}
