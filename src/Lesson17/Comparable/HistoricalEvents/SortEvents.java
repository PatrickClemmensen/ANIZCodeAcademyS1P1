package Lesson17.Comparable.HistoricalEvents;


import java.util.*;

// Testklasse – her prøver vi at bruge HistoricalEvent-klassen
// Teori: En testklasse har en main-metode, som er startpunktet for programmet.
// Vi laver en ArrayList<HistoricalEvent> med forskellige begivenheder,
// printer dem ud, sorterer dem og printer igen.

public class SortEvents {
    public static void main(String[] args) {
        // 1. ArrayList med historiske begivenheder
        List<HistoricalEvent> events = new ArrayList<>();

        // 2. Tilføj begivenheder (årstal + beskrivelse)
        events.add(new HistoricalEvent(1969, "First human on the Moon"));
        events.add(new HistoricalEvent(1914, "Start of World War I"));
        events.add(new HistoricalEvent(1989, "Fall of the Berlin Wall"));
        events.add(new HistoricalEvent(1939, "Start of World War II"));
        events.add(new HistoricalEvent(2001, "9/11 Terrorist Attacks"));

        // 3. Print listen (usorteret)
        System.out.println("Original list of events:");
        for (HistoricalEvent e : events) {
            System.out.println(e); // toString() bliver kaldt automatisk
        }

        // 4. Sortér listen (Collections.sort kalder compareTo)
        Collections.sort(events);

        // 5. Print listen igen – nu er den sorteret efter årstal
        System.out.println("\nSorted list of events (oldest first):");
        for (HistoricalEvent e : events) {
            System.out.println(e);
        }

        // 6. Hvis vi ønsker det modsatte (nyeste først), kan vi kalde:
        Collections.sort(events, Collections.reverseOrder());

        System.out.println("\nSorted list of events (newest first):");
        for (HistoricalEvent e : events) {
            System.out.println(e);
        }

        // Find laveste og højeste barn
        HistoricalEvent latest = events.get(0);
        HistoricalEvent earliest = events.get(events.size() - 1);

        System.out.println("\nEarliest event: " + earliest);
        System.out.println("Latest event: " + latest);
    }
}
