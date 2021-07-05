package firstTask;

public class Book {
    private String title;
    private Author author;
    private Double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String title, Author author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void bookDescription() {
        System.out.println("'" + title + "'" + ", " + author.getFirstName() + " " + author.getLastName() + ", " + price);
    }

}
