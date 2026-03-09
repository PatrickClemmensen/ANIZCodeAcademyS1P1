package Lesson17.Comparable.Kid;

import java.util.*;

// Testklasse hvor vi laver en liste af børn og sorterer dem.
// Teori: Vi bruger ArrayList<Kid> til at gemme børnene.
// Collections.sort() kalder compareTo() fra Kid-klassen.

public class KidTest {
    public static void main(String[] args) {
        List<Kid> kids = new ArrayList<>();

        // Tilføj børn til listen
        kids.add(new Kid("Anna", 130));
        kids.add(new Kid("Lucas", 145));
        kids.add(new Kid("Mia", 120));
        kids.add(new Kid("Oscar", 155));
        kids.add(new Kid("Emma", 140));

        // Print listen usorteret
        System.out.println("Original list of kids:");
        for (Kid k : kids) {
            System.out.println(k);
        }

        // Sortér listen efter højde (lav til høj)
        Collections.sort(kids);

        // Print listen efter sortering
        System.out.println("\nSorted by height (shortest to tallest):");
        for (Kid k : kids) {
            System.out.println(k);
        }

        // Find laveste og højeste barn
        Kid shortest = kids.get(0);
        Kid tallest = kids.get(kids.size() - 1);

        System.out.println("\nShortest kid: " + shortest);
        System.out.println("Tallest kid: " + tallest);
    }
}
