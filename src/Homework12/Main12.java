package Homework12;

public class Main12 {
    /*public static Book CreateBook (String name, int yearPublication){
        Book book = new Book();
        Book.name = name;
        Book.yearPublication = yearPublication;
        return book;
    }*/
    public static void main(String[] args) {
        //объекты и классы
        Book warAndPeace = new Book("Война и мир", 2001);
        Author warAndPeaceAuthor = new Author("Лев", "Толстой");

        Book aelita = new Book("Аэлита", 1995);
        Author aelitaAuthor = new Author("Алексей", "Толстой");

        System.out.println("'" + warAndPeace.getName() + "' " + warAndPeace.getYearPublication() + " года издания" + " автор " + warAndPeaceAuthor.getName() + " "+ warAndPeaceAuthor.getSurname());
        System.out.println("'" + aelita.getName() + "' " + aelita.getYearPublication() + " года издания"  + " автор " + aelitaAuthor.getName() + " "+ aelitaAuthor.getSurname());

        aelita.setYearPublication(2021);
        System.out.println("'" + aelita.getName() + "' " + aelita.getYearPublication() + " года издания"  + " автор " + aelitaAuthor.getName() + " "+ aelitaAuthor.getSurname());
    }
}
