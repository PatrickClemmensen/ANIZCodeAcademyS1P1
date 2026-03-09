package Lesson16.Spotify.model;

public class FreeUser extends User {

    public FreeUser(String username) {
        super(username);
    }

    @Override
    public void showUserType() {
        System.out.println("Free User (Ads enabled)");
    }
}