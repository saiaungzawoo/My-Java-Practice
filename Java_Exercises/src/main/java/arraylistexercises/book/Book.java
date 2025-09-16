package arraylistexercises.book;

public class Book {
    private String title;
    private String author;
    private double price;

    //constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    //convert these obj into string format
    public String toString(){
        return title + author + price;
    }
}
