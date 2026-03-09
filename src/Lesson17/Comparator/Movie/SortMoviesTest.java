package Lesson17.Comparator.Movie;

import java.util.*;

public class SortMoviesTest {
    public static void main(String[] args) {
        // 3. Opret liste med mindst 5 Movie-objekter
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 2010));
        movies.add(new Movie("The Godfather", "Crime", 1972));
        movies.add(new Movie("Titanic", "Romance", 1997));
        movies.add(new Movie("Avengers: Endgame", "Action", 2019));
        movies.add(new Movie("Pulp Fiction", "Crime", 1994));

        // Udskriv original listen
        System.out.println("Original list:");
        movies.forEach(System.out::println);
        System.out.println();

        // 4a & 5a: Collections.sort med MovieTitleComparator
        Collections.sort(movies, new MovieTitleComparator());
        System.out.println("Sorted by title (Collections.sort):");
        movies.forEach(System.out::println);
        System.out.println();

        // 5b: list.sort() med MovieGenreComparator
        movies.sort(new MovieGenreComparator());
        System.out.println("Sorted by genre (list.sort):");
        movies.forEach(System.out::println);
        System.out.println();

        // Sortering efter releaseYear med Collections.sort
        Collections.sort(movies, new MovieYearComparator());
        System.out.println("Sorted by release year (Collections.sort):");
        movies.forEach(System.out::println);
    }
}

