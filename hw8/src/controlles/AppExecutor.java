package controlles;

import task1.ActionValue;
import task2.User;
import task2.UserService;
import task2.UserServiceImpl;
import task3.Movie;
import task3.MovieService;
import task3.MovieServiceImpl;
import task4.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppExecutor {
    private UserService userService = new UserServiceImpl();
    private MovieService movieService = new MovieServiceImpl();
    private ProtectorService protectorService = new ProtectorServiceImpl();

    public void runProgram() {
        //task1
        System.out.println(new ActionValue().getNumber(5));

        //task2
        List<User> users = Arrays.asList(new User("Anton228@gmail.com", LocalDate.now(), "Bear"),
                new User("Vladik322@gmail.com", LocalDate.now().minusWeeks(2), "Tiger"),
                new User("Viktor1999@gmail.com", LocalDate.now().minusWeeks(3), "Tiger"));
        Map<String, List<String>> loggedUsers = userService.getLoggedUsers(users);
        loggedUsers.forEach(
                (key, value) -> System.out.println("Team: " + key + ", " + "Emails: " + String.join(", ", value)));

        // task3
        List<Movie> movie1 =
                Arrays.asList(new Movie(12.0D, "Comedy"), new Movie(56.44D, "Horror"), new Movie(14.0D, "Comedy"));
        List<Movie> movie2 = Arrays.asList(new Movie(13.0D, "Comedy"), new Movie(85.44D, "Drama"));
        List<Movie> movies = Stream.concat(movie1.stream(), movie2.stream()).collect(Collectors.toList());

        Map<String, Double> avgPricePerGenre = movieService.getAvgPricePerGenre(movies);
        avgPricePerGenre
                .forEach((key, value) -> System.out.println("Genre: " + key + ", " + "average price: " + value));

        Map<String, Long> moviesCountPerGenre = movieService.getMoviesCountPerGenre(movies);
        moviesCountPerGenre
                .forEach((key, value) -> System.out.println("Genre: " + key + ", " + "movies count: " + value));

        //task4
        List<Box> boxes = Arrays.asList(new Box(Arrays.asList(new Thing(false, "book"), new Thing(true, "phone"))),
                new Box(Arrays.asList(new Thing(false, "mouse"), new Thing(true, "monitor"))));
        System.out.println("All things: ");
        boxes.stream().flatMap(box -> box.getThings().stream()).forEach(thing -> System.out.println(thing.toString()));
        System.out.println("fragile things: ");
        protectorService.protectThings(boxes).stream().map(Protector::getThing)
                        .forEach(thing -> System.out.println(thing.toString()));

    }
}
