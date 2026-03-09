package Lesson16.Spotify.service;
import Lesson16.Spotify.model.*;
import java.io.*;
import java.util.ArrayList;

public class PlaylistFileHandler {

    private static final String FILE_NAME = "playlist.txt";

    public ArrayList<Song> loadPlaylist() {

        ArrayList<Song> songs = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) return songs;

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                String title = parts[0];
                Genre genre = Genre.valueOf(parts[1]);

                songs.add(new Song(title, genre));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return songs;
    }

    public void savePlaylist(ArrayList<Song> songs) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Song song : songs) {
                writer.write(song.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}