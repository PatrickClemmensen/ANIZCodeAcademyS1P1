package Lesson16.Spotify.ui;

import Lesson16.Spotify.model.*;
import Lesson16.Spotify.service.PlaylistFileHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Song> playlist;
    private PlaylistFileHandler fileHandler;
    private Scanner scanner;
    private User user;

    public UserInterface() {

        scanner = new Scanner(System.in);
        fileHandler = new PlaylistFileHandler();
        playlist = fileHandler.loadPlaylist(); // AUTO LOAD
        createUser();
    }

    private void createUser() {

        System.out.print("Enter username: ");
        String name = scanner.nextLine();

        System.out.println("Choose user type: 1.Free 2.Premium");
        int type = Integer.parseInt(scanner.nextLine());

        if (type == 1) {
            user = new FreeUser(name);
        } else {
            user = new PremiumUser(name);
        }

        user.showUserType(); // Polymorphism
    }

    public void start() {

        boolean running = true;

        while (running) {

            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1: addSong(); break;
                case 2: removeSong(); break;
                case 3: showSongs(); break;
                case 4: searchSong(); break;
                case 5: editSong(); break;
                case 6: sortSongs(); break;
                case 7:
                    fileHandler.savePlaylist(playlist); // AUTO SAVE
                    running = false;
                    break;
            }
        }
    }

    private void printMenu() {

        System.out.println("\nWelcome to your homemade Spotify!");
        System.out.println("1. Add new song");
        System.out.println("2. Remove a song");
        System.out.println("3. Show all songs");
        System.out.println("4. Search for a song");
        System.out.println("5. Edit a song");
        System.out.println("6. Sort song list");
        System.out.println("7. Exit");
    }

    private void addSong() {

        System.out.print("Title: ");
        String title = scanner.nextLine();

        Genre genre = null;

        try {
            System.out.print("Genre (ROCK, POP, JAZZ...): ");
            genre = Genre.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid genre!");
            return;
        }

        playlist.add(new Song(title, genre));
        System.out.println("Song added.");
    }

    private void removeSong() {

        System.out.print("Enter title to remove: ");
        String title = scanner.nextLine();

        Song found = findSong(title);

        if (found != null) {
            playlist.remove(found);
            System.out.println("Song removed.");
        } else {
            System.out.println("Song not found.");
        }
    }

    private void showSongs() {

        if (playlist.isEmpty()) {
            System.out.println("Playlist empty.");
            return;
        }

        for (Song song : playlist) {
            System.out.println(song.getTitle() + " - " + song.getGenre());
        }
    }

    private void searchSong() {

        System.out.print("Search title: ");
        String title = scanner.nextLine();

        Song found = findSong(title);

        if (found != null) {
            System.out.println("Found: " + found.getTitle());
        } else {
            System.out.println("Song not found.");
        }
    }

    private void editSong() {

        System.out.print("Enter title to edit: ");
        String title = scanner.nextLine();

        Song found = findSong(title);

        if (found != null) {

            System.out.print("New title: ");
            String newTitle = scanner.nextLine();

            found.setTitle(newTitle);
            System.out.println("Song updated.");

        } else {
            System.out.println("Song not found.");
        }
    }

    private void sortSongs() {

        Collections.sort(playlist);
        System.out.println("Playlist sorted.");
    }

    private Song findSong(String title) {

        for (Song song : playlist) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }
}