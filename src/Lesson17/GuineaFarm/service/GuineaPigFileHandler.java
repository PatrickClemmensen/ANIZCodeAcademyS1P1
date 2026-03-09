package Lesson17.GuineaFarm.service;

import Lesson17.GuineaFarm.model.*;

import java.io.*;
import java.util.ArrayList;

/*
 This class handles all file operations.

 STUDENT TASKS:
 1) Read guinea pigs from a CSV file
 2) Convert CSV lines into GuineaPig objects
 3) Save the list back to CSV
*/

public class GuineaPigFileHandler {

    private static final String FILE_NAME = "guineapigs.csv";

    public ArrayList<GuineaPig> loadPigs() {

        ArrayList<GuineaPig> pigs = new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = reader.readLine()) != null) {

                /*
                Example CSV line:

                Coco,2,1.2,AMERICAN,BROWN

                TASK:
                1 split the line
                2 convert values
                3 create a GuineaPig object
                4 add it to pigs
                */

                // STUDENT CODE HERE



            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pigs;
    }

    public void savePigs(ArrayList<GuineaPig> pigs) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(FILE_NAME));

            for (GuineaPig pig : pigs) {

                /*
                 TASK:

                 Convert the object back to CSV format.

                 Example output line:

                 Coco,2,1.2,AMERICAN,BROWN
                */

                // STUDENT CODE HERE


                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}