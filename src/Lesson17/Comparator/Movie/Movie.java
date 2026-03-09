package Lesson17.Comparator.Movie;


// Klassen Movie repræsenterer en film med titel, genre og udgivelsesår
// Teori: Vi bruger OOP til at samle data i ét objekt, som vi kan sortere med Comparator

public class Movie {
    private String title;
    private String genre;
    private int releaseYear;

    // Constructor
    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // toString() gør det let at udskrive objekter
    @Override
    public String toString() {
        return title + " (" + genre + ", " + releaseYear + ")";
    }
}
