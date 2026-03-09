package Lesson17.CSVFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVExample {

    public static void main(String[] args) {

        String filePath = "studentsWriteCSV.csv";

        try {
            FileWriter writer = new FileWriter(filePath);

            writer.write("name,age,city\n");
            writer.write("Anna,22,Copenhagen\n");
            writer.write("Jonas,21,Aarhus\n");
            writer.write("Sara,23,Odense\n");

            writer.close();

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}