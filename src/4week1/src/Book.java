// Book.java
public class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setters and Getters
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayValues() {
        System.out.println(
                "The title of the book is " + getTitle() +
                        " and the name of the author is " + author.getName() +
                        " and the age of the author is " + author.getAge()
        );
    }
}