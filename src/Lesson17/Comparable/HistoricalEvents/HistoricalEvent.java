package Lesson17.Comparable.HistoricalEvents;


// Klassen repræsenterer en historisk begivenhed
// Teori: I OOP (Objektorienteret programmering) definerer vi en klasse
// med attributter (fx year, description) for at kunne gemme flere ting samlet.
// Hvert objekt (instans) af klassen er en begivenhed.

public class HistoricalEvent implements Comparable<HistoricalEvent> {
    private int year;            // årstal for begivenheden
    private String description;  // kort tekst om begivenheden

    // 1. Constructor – bruges til at oprette en ny historisk begivenhed
    public HistoricalEvent(int year, String description) {
        this.year = year;
        this.description = description;
    }

    // 2. Getters (kun til at læse værdier)
    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    // 3. compareTo-metoden
    // Teori: Når en klasse implementerer Comparable, kan objekter af den
    // klasse sammenlignes med hinanden. Collections.sort() bruger compareTo().
    // Vi vælger her at sammenligne på årstallet.
    @Override
    public int compareTo(HistoricalEvent o) {
        // Stigende sortering (ældste først)
        return Integer.compare(this.year, o.year);

        // Hvis du vil have det i faldende rækkefølge (nyeste først):
        // return Integer.compare(o.year, this.year);
    }

    // 4. toString-metoden
    // Teori: Når vi printer et objekt, kalder Java automatisk toString().
    // Her definerer vi selv hvordan objektet vises.
    @Override
    public String toString() {
        return year + ": " + description;
    }
}
