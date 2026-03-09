package Lesson17.GuineaFarm.ui;

import Lesson17.GuineaFarm.model.GuineaPig;
import Lesson17.GuineaFarm.service.GuineaPigFileHandler;
import Lesson17.GuineaFarm.util.GuineaPigSorter;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<GuineaPig> pigs;
    private GuineaPigFileHandler fileHandler;
    private Scanner scanner;

    public UserInterface() {

        fileHandler = new GuineaPigFileHandler();
        scanner = new Scanner(System.in);

        pigs = fileHandler.loadPigs();
    }

    public void start() {

        boolean running = true;

        while (running) {

            System.out.println("\nGuinea Pig Manager");
            System.out.println("1 Show pigs");
            System.out.println("2 Sort by name");
            System.out.println("3 Sort by age");
            System.out.println("4 Sort by weight");
            System.out.println("5 Save and exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    showPigs();
                    break;

                case 2:
                    GuineaPigSorter.sortByName(pigs);
                    break;

                case 3:
                    GuineaPigSorter.sortByAge(pigs);
                    break;

                case 4:
                    GuineaPigSorter.sortByWeight(pigs);
                    break;

                case 5:
                    fileHandler.savePigs(pigs);
                    running = false;
                    break;
            }
        }
    }

    private void showPigs() {

        for (GuineaPig pig : pigs) {
            System.out.println(pig);
        }
    }
}