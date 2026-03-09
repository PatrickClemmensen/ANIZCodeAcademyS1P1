package Lesson17.CSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVExample {

    public static void main(String[] args) {

        String filePath = "students.csv";
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("Name: " + data[0]);
                System.out.println("Age: " + data[1]);
                System.out.println("City: " + data[2]);
                System.out.println("-----");
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}