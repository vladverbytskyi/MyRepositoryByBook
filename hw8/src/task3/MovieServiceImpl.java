package task3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieServiceImpl implements MovieService {

    @Override
    public Map<String, Double> getAvgPricePerGenre(List<Movie> movies) {
        return movies.stream().collect(
                Collectors.groupingBy(Movie::getGenre, Collectors.averagingDouble(Movie::getTicketsPrice)));
    }

    @Override
    public Map<String, Long> getMoviesCountPerGenre(List<Movie> movies) {
        return movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
    }
}
