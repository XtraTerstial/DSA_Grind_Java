package HunderedDays_BootCamp.Day_1_to_10.Day_6.Streams.intermediate;

public class Book {
    String title;
    int publicationYear;
    double price;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    String category;

    public Book(String title, int publicationYear, double price, String category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;
    }
}
