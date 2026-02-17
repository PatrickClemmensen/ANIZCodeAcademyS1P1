package Lesson09.SortingObjectsInArray;
public class StudentTest {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Emma", 22, 8.5),
                new Student("Lucas", 20, 12.0),
                new Student("Oliver", 23, 7.2),
                new Student("Sofia", 21, 10.5)
        };

        System.out.println("Original order:");
        printStudents(students);

        sortByName(students);
        System.out.println("Sorted by name (A-Z):");
        printStudents(students);

        sortByAge(students);
        System.out.println("Sorted by age (youngest first):");
        printStudents(students);

        sortByGrade(students);
        System.out.println("Sorted by grade (highest first):");
        printStudents(students);
    }

    // ---------------------------------------
    // Print all students
    // ---------------------------------------
    public static void printStudents(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println();
    }

    // ---------------------------------------
    // Sort by name (Alphabetical A-Z)
    // ---------------------------------------
    public static void sortByName(Student[] students) {

        // Bubble sort using nested loops
        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0; j < students.length - 1; j++) {

                // compareTo compares Strings alphabetically
                // If result > 0 → first name comes AFTER second name
                if (students[j].getName()
                        .compareTo(students[j + 1].getName()) > 0) {

                    // Swap objects
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // ---------------------------------------
    // Sort by age (youngest first)
    // ---------------------------------------
    public static void sortByAge(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0; j < students.length - 1; j++) {

                // If first student is older → swap
                if (students[j].getAge() > students[j + 1].getAge()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // ---------------------------------------
    // Sort by grade (highest first)
    // ---------------------------------------
    public static void sortByGrade(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0; j < students.length - 1; j++) {

                // We want highest grade first
                // If first grade is smaller → swap
                if (students[j].getGrade() < students[j + 1].getGrade()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
