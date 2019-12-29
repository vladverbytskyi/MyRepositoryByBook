package task3;

public class Movie {

    private Double ticketsPrice;
    private String genre;

    public Movie(Double ticketsPrice, String genre) {
        this.ticketsPrice = ticketsPrice;
        this.genre = genre;
    }

    public Double getTicketsPrice() {
        return ticketsPrice;
    }

    public String getGenre() {
        return genre;
    }
}
