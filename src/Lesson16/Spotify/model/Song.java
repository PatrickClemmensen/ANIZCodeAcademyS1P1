package Lesson16.Spotify.model;

public class Song implements Comparable<Song> {

    private String title;
    private Genre genre;

    public Song(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public int compareTo(Song other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return title + "," + genre;
    }
}