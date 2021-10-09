package pro.sky.java.course1;

public class Book {
    private final String nameBook;
    private final String authorName;
    private int yearOfPublication;


    public Book(String name, String authorName, int yearOfPublication) {
        this.nameBook = name;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {

        return this.nameBook;
    }

    public String getAuthorName() {

        return this.authorName;
    }

    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

}
