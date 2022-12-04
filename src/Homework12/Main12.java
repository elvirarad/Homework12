package Homework12;

public class Main12 {
    public static void main(String[] args) {
        //объекты и классы
        Author warAndPeaceAuthor = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", 2001, warAndPeaceAuthor);

        Author aelitaAuthor = new Author("Алексей", "Толстой");
        Book aelita = new Book("Аэлита", 1995, aelitaAuthor);

        Book[] library = new Book[2];
        library[0] = warAndPeace;
        library[1] = aelita;
        for (Book book : library){
            System.out.println(book);
        }

        //System.out.println("'" + warAndPeace.getName() + "' " + warAndPeace.getYearPublication() + " года издания" + " автор " + warAndPeaceAuthor.getName() + " "+ warAndPeaceAuthor.getSurname());
       // System.out.println("'" + aelita.getName() + "' " + aelita.getYearPublication() + " года издания"  + " автор " + aelitaAuthor.getName() + " "+ aelitaAuthor.getSurname());

        aelita.setYearPublication(2021);
        System.out.println(aelita);
    }
}
