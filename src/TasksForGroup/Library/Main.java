package TasksForGroup.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library book1 = new Library("Harry Potter", "J. K. Roawling", "Fantasy", 67);
        Library book2 = new Library("Pułapki myślenia", "Kahneman Daniel", "Kryminał", 49);
        Library book3 = new Library("Do sna", "Katarzyna Bonda", "Kryminał", 89);
        Library book4 = new Library("Werdykt", "Joanna Chyłka", "Kryminał", 34);
        Library book5 = new Library("Krew Elfów", "Andrzej Sapkowski", "Fantasy", 53);
        Library book6 = new Library("Ostatnie życzenie", "Andrzej Sapkowski", "Fantasy", 73);

        List<Library> allBooks = List.of(book1, book2, book3, book4, book5, book6);
        System.out.println(allBooks);

        Library.sortedByPriceAndCategory(allBooks, "Kryminał", 80);
        Library.lastTwoBooks(allBooks);
        Library.cheapestBook(allBooks, "Kryminał");
        Library.expensiveBook(allBooks, "Kryminał");
        Library.booksWithDiscount(allBooks, "Andrzej Sapkowski");

    }
}
