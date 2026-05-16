// MyLibrary.java
public class MyLibrary {
    public static void main(String[] args) {

        Author author = new Author("James", 24);

        Book book = new Book("mgaga wa kuweenda iwij", author);

        book.displayValues();
    }
}