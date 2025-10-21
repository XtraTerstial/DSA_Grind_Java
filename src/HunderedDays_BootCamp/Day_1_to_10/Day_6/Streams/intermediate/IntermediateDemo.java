package HunderedDays_BootCamp.Day_1_to_10.Day_6.Streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateDemo {
    void main() {
        List<Book> books = Arrays.asList(
                new Book("The Lord of the Rings", 1954, 22.99, "Fantasy"),
                new Book("Clean Code", 2008, 34.99, "Technology"),
                new Book("1984", 1949, 15.50, "Fiction"),
                new Book("The Pragmatic Programmer", 1999, 45.50, "Technology"),
                new Book("Sapiens", 2011, 19.99, "Non-Fiction"),
                new Book("The Hitchhiker's Guide", 1979, 12.00, "Sci-Fi"),
                new Book("To Kill a Mockingbird", 1960, 14.99, "Fiction"),
                new Book("A Brief History of Time", 1988, 18.75, "Science"),
                new Book("Introduction to Algorithms", 1990, 89.99, "Technology"),
                new Book("The Hobbit", 1937, 11.99, "Fantasy"),
                new Book("Dune", 1965, 21.50, "Sci-Fi")
        );

        //1. Filtering: Books cheaper than 20$
        Stream<Book> filteredStream = books.stream()
                .filter(p-> p.price < 20);
        filteredStream.forEach(System.out::println);

        //2. Mapping: Convert Books title to UpperCase
        Stream<String> convertStream = books.stream()
                .map(t -> t.title.toUpperCase());
        convertStream.forEach(System.out::println);

        //3. Sorting: Books by publication date
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book-> book.publicationYear));
        sortedBooks.forEach(System.out::println);

        //4. Distinct: Remove Duplicate titles
        Stream<Book> uniqueBooks = books.stream()
                .distinct();
        uniqueBooks.forEach(System.out::println);

        //5. Limit: Display only the first 3 books
        System.out.println("DISPLAY FIRST THREE BOOKS BY PUBLICATION YEAR");
        Stream<Book> firstThreeBooks = books.stream()
                .sorted(Comparator.comparingInt(book-> book.publicationYear))
                .limit(3);
        firstThreeBooks.forEach(System.out::println);

        //6. Skip: skip
        Stream<Book> afterSkippingTwo = books.stream()
                .skip(2);
        afterSkippingTwo.forEach(System.out::println);
    }
}
