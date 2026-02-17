package Lesson09.MiniProject;


import java.util.Scanner;

/*
 * Test Class
 * Contains main method and several helper methods
 */
public class PetAdoptionCenter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        printWelcome();

        int count = askForPetCount(sc);

        Pet[] pets = registerPets(sc, count);

        printPets(pets);

        sortPetsByName(pets);   // Manual sorting (NO Comparable)

        System.out.println("\n--- Pets Sorted by Name ---");
        printPets(pets);

        sc.close();
    }

    /*
     * Prints welcome message
     */
    public static void printWelcome() {
        System.out.println("🐾 Welcome to the Pet Adoption Center 🐾");
        System.out.println("Let's register some animals!");
    }

    /*
     * Asks user how many pets they want to register
     * Validates input
     */
    public static int askForPetCount(Scanner sc) {

        int count = 0;

        while (true) {

            System.out.print("How many pets do you want to register? ");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                sc.nextLine(); // Clear buffer

                if (count > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number!");
                }
            } else {
                System.out.println("That wasn't a number, try again!");
                sc.nextLine(); // Clear invalid input
            }
        }

        return count;
    }

    /*
     * Registers pets and returns the array
     */
    public static Pet[] registerPets(Scanner sc, int count) {

        Pet[] pets = new Pet[count];

        for (int i = 0; i < count; i++) {

            System.out.println("\nRegister pet #" + (i + 1));

            System.out.print("Type (dog/cat/lizard): ");
            String type = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            // Create correct object based on type
            if (type.equalsIgnoreCase("dog")) {
                pets[i] = new Dog(name);
            } else if (type.equalsIgnoreCase("cat")) {
                pets[i] = new Cat(name);
            } else if (type.equalsIgnoreCase("lizard")) {
                pets[i] = new Lizard(name);
            } else {
                System.out.println("Unknown type, saving as generic pet.");
                pets[i] = new Pet(name);
            }
        }

        return pets;
    }

    /*
     * Prints all pets in the array
     */
    public static void printPets(Pet[] pets) {

        System.out.println("\n--- Pets Registered ---");

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]); // toString() is called automatically
        }
    }

    /*
     * Sorts pets alphabetically by name
     * Manual bubble sort
     * NO Comparable used
     */
    public static void sortPetsByName(Pet[] pets) {

        // Outer loop controls number of passes
        for (int i = 0; i < pets.length - 1; i++) {

            // Inner loop compares neighboring elements
            for (int j = 0; j < pets.length - 1 - i; j++) {

                /*
                 * compareTo compares two Strings alphabetically.
                 * If result > 0, first name comes AFTER second name.
                 * That means we need to swap them.
                 */
                if (pets[j].getName()
                        .compareTo(pets[j + 1].getName()) > 0) {

                    // Swap objects
                    Pet temp = pets[j];
                    pets[j] = pets[j + 1];
                    pets[j + 1] = temp;
                }
            }
        }
    }
}
