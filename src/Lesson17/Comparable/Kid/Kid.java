package Lesson17.Comparable.Kid;


// Klassen Kid repræsenterer et barn med et navn og en højde.
// Teori: Vi laver en klasse for at samle data (name + heightInCm) i ét objekt.
// Vi implementerer Comparable<Kid>, så vi kan sortere børn direkte.

public class Kid implements Comparable<Kid> {
    private String name;
    private int heightInCm; // barnets højde i cm

    // Constructor
    public Kid(String name, int heightInCm) {
        this.name = name;
        this.heightInCm = heightInCm;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    // compareTo bruges af Collections.sort()
    // Vi sorterer på højde
    @Override
    public int compareTo(Kid o) {
        // stigende sortering (laveste først)
        return Integer.compare(this.heightInCm, o.heightInCm);
    }

    // toString: hvordan objektet vises ved udskrift
    @Override
    public String toString() {
        return name + " (" + heightInCm + " cm)";
    }
}
