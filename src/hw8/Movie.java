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

    public String getAll() {
        return Movie.title + " " + Movie.studio + " " + Movie.rating;
    }


}
