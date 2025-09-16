package arraylistexercises.book;

public class Main {
    public static void main(String[] args) {

       BookCollection bc = new BookCollection();
       bc.addBook( new Book("Harry Potter", "J.K, Rowling", 11.9));
        bc.addBook( new Book("Animal Farm", "George Orwell", 11.9));
       bc.removeBook();
        System.out.println();
        bc.displayBook();

    }
}
