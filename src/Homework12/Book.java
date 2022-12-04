package Homework12;
import java.util.Objects;

public class Book {
    private String name;
    private int yearPublication;

    private Author author;

    public Book (String name, int yearPublication, Author author){
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = author;
        }

    public String getName() {return this.name;}

    public int getYearPublication() {return this.yearPublication;}

    public Author getAuthor() {return this.author;}

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Книга '" + name + "', " + yearPublication + " года издания"  + " автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublication, author);
    }
}
