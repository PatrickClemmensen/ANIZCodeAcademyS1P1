package Lesson16.Spotify.model;

public class PremiumUser extends User {

    public PremiumUser(String username) {
        super(username);
    }

    @Override
    public void showUserType() {
        System.out.println("Premium User (No ads, Download enabled)");
    }
}