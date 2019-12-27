package contoller;

import task.Library;
import task.NewLibrary;

import java.time.LocalDate;

public class AppExecutor {
    public void runProgram() {
        Library objectLibrary = new Library();
        objectLibrary.putBooks();
        objectLibrary.checkBooks(LocalDate.of(2019, 10, 19));
        objectLibrary.returnListNames();
        objectLibrary.returnDateList();

        new NewLibrary().returnBook(LocalDate.of(2019, 10, 17), LocalDate.of(2019, 10, 21));
    }
}
