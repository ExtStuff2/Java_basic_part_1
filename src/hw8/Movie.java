package hw8;

public class Movie {
    private static String title, studio, rating;

    public Movie(String title, String studio, String rating) {
        Movie.title = title;
        Movie.studio = studio;
        Movie.rating = rating;
    }

    public Movie(String title, String studio) {
        Movie.title = title;
        Movie.studio = studio;
        Movie.rating = "PG";
    }

    @Override
    public String toString() {
        return Movie.title + " " + Movie.studio + " " + Movie.rating;
    }

    @Override
    public boolean equals(Object obj) {
        Movie movie = (Movie) obj;
        return movie.toString().equals(movie.toString());
    }

    @Override
    public int hashCode() {
        return (int) Math.pow(9, this.toString().hashCode());
    }

    @Override
    protected Object clone() {
        return new Movie(title, studio, rating);
    }
}
