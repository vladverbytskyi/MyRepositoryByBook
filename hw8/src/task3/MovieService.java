package task3;

import java.util.List;
import java.util.Map;

public interface MovieService {
    Map<String, Double> getAvgPricePerGenre(List<Movie> movies);

    Map<String, Long> getMoviesCountPerGenre(List<Movie> movies);
}
