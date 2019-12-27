package task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewLibrary {
    private Map<LocalDate, ArrayList<String>> listOfBook = new HashMap<>();

    private void putBook(LocalDate date, String name) {
        if (listOfBook.get(date) == null) {
            listOfBook.put(date, new ArrayList<>() {{
                add(name);
            }});
        } else {
            listOfBook.get(date)
                    .add(name);
        }
    }

    public void returnBook(LocalDate firstDay, LocalDate lastDay) {
        putBook(LocalDate.of(2019, 10, 17), "It");
        putBook(LocalDate.of(2019, 10, 17), "War and Peace");
        putBook(LocalDate.of(2019, 10, 18), "Song of Solomon");
        putBook(LocalDate.of(2019, 10, 19), "Ulysses");
        putBook(LocalDate.of(2019, 10, 20), "The Shadow of the Wind");
        putBook(LocalDate.of(2019, 10, 20), "The Lord of the Rings");
        putBook(LocalDate.of(2019, 10, 20), "The Satanic Verses");
        putBook(LocalDate.of(2019, 10, 20), "Don Quixote");
        putBook(LocalDate.of(2019, 10, 21), "The Golden Compass");

        for (LocalDate date = firstDay; date.isBefore(lastDay); date = date.plusDays(1)) {
            System.out.println(date + " - " + listOfBook.getOrDefault(date, new ArrayList<>())
                    .size());
        }
    }
}
