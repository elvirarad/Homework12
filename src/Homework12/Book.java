package Homework12;

public class Book {
    private String name;
    private int yearPublication;

    private Author author;

    public Book (String name, int yearPublication, Author author){
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = getAuthor();
        }

    public String getName() {return this.name;}

    public int getYearPublication() {return this.yearPublication;}

    public Author getAuthor() {return this.author;}

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
