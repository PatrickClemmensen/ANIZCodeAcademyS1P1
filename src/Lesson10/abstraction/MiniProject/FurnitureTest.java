package Lesson10.abstraction.MiniProject;

import java.util.Scanner;

/*
 * Test class demonstrating:
 * - Abstraction
 * - Inheritance
 * - Polymorphism
 * - Arrays
 * - Manual sorting
 * - Input validation
 */
public class FurnitureTest {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = askForCount(sc);

        Furniture[] furnitureArray = createFurnitureArray(sc, count);

        printFurniture(furnitureArray);

        sortByPrice(furnitureArray);

        System.out.println("\n--- Sorted by Price ---");
        printFurniture(furnitureArray);

        sc.close();
    }


    // Ask user for number of furniture items
    public static int askForCount(Scanner sc) {

        int count = 0;

        while (true) {
            System.out.print("How many furniture items? ");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                sc.nextLine();

                if (count > 0) break;
                else System.out.println("Enter a positive number!");
            } else {
                System.out.println("Invalid number!");
                sc.nextLine();
            }
        }

        return count;
    }

    // Create furniture objects
    public static Furniture[] createFurnitureArray(Scanner sc, int count) {

        Furniture[] arr = new Furniture[count];

        for (int i = 0; i < count; i++) {

            System.out.println("\nType (chair/table/sofa/bed): ");
            String type = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Material: ");
            String material = sc.nextLine();

            if (type.equalsIgnoreCase("chair")) {

                arr[i] = new Chair(name, price, material, true);

            } else if (type.equalsIgnoreCase("table")) {

                arr[i] = new Table(name, price, material, 4);

            } else if (type.equalsIgnoreCase("sofa")) {

                arr[i] = new Sofa(name, price, material, 3);

            } else if (type.equalsIgnoreCase("bed")) {

                arr[i] = new Bed(name, price, material, "Queen");

            } else {

                System.out.println("Unknown type. Defaulting to Chair.");
                arr[i] = new Chair(name, price, material, false);
            }
        }

        return arr;
    }

    // Print array
    public static void printFurniture(Furniture[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Manual bubble sort by price
    public static void sortByPrice(Furniture[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j].getPrice() > arr[j + 1].getPrice()) {

                    Furniture temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
