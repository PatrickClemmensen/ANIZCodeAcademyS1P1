package Lesson17.Comparator.Fish;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Test class
public class FishTest {
    public static void main(String[] args) {
        List<Fish> catchList = new ArrayList<>();
        catchList.add(new Fish("Salmon", 4.5));
        catchList.add(new Fish("Trout", 2.3));
        catchList.add(new Fish("Cod", 3.1));
        catchList.add(new Fish("Herring", 1.0));

        System.out.println("Original catch:");
        System.out.println(catchList);
        System.out.println();

        // Sort by weight
        Collections.sort(catchList, new FishWeightComparator());
        System.out.println("Sorted by weight:");
        System.out.println(catchList);
        System.out.println();

        // Sort by name
        Collections.sort(catchList, new FishNameComparator());
        System.out.println("Sorted by name:");
        System.out.println(catchList);
    }
}

