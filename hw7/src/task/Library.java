package task;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<LocalDate, String> library = new HashMap<>();

    public void putBooks() {
        library.put(LocalDate.of(2019, 10, 18), "War and Peace");
        library.put(LocalDate.of(2019, 10, 19), "Song of Solomon");
        library.put(LocalDate.of(2019, 10, 20), "Ulysses");
        library.put(LocalDate.of(2019, 10, 21), "The Shadow of the Wind");
        library.put(LocalDate.of(2019, 10, 22), "The Lord of the Rings");
        library.put(LocalDate.of(2019, 10, 23), "The Satanic Verses");
        library.put(LocalDate.of(2019, 10, 24), "Don Quixote");
        library.put(LocalDate.of(2019, 10, 25), "The Golden Compass");
    }

    public void checkBooks(LocalDate date) {
        if (library.get(date) == null) {
            System.out.println("There are no books for this date - " + date);
        } else {
            System.out.println("You have selected a date - " + date + " You have found the following books at your request " + "@ " + library.get(date) + " @");
        }
    }

    public void returnListNames() {
        Collection<String> listOfBooks = library.values();
        System.out.println("The whole list of books: " + listOfBooks);
    }

    public void returnDateList() {
        System.out.println("List of dates when books were taken: " + library.keySet());
    }
}
