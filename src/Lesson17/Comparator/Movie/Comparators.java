package Lesson17.Comparator.Movie;

import java.util.*;

// Comparator til at sortere efter titel (alfabetisk)
class MovieTitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareToIgnoreCase(m2.getTitle());
    }
}

// Comparator til at sortere efter genre (alfabetisk)
class MovieGenreComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getGenre().compareToIgnoreCase(m2.getGenre());
    }
}

// Comparator til at sortere efter releaseYear (stigende)
class MovieYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
    }
}
