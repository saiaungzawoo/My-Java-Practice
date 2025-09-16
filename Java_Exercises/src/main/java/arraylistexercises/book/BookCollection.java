package arraylistexercises.book;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    //init array list of Book object to store books
    List<Book> books = new ArrayList<>();


    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(){
        books.remove(1);
    }



    public void displayBook(){
        for(Book bookDisplay : books){
            System.out.println(bookDisplay);
//            System.out.println("Book Title: " + book.getTitle());
//            System.out.println("Author: " + book.getAuthor());
//            System.out.println("Price: " + book.getPrice());
        }
    }



}
