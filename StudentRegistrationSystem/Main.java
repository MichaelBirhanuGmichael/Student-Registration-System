
import java.util.Scanner;
import java.util.List;

import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("************************ Welcome to Haramaya University Student Registration System ******************************** ");
            Student student = registerStudent(input);

            boolean continueRegistration = true;
            while (continueRegistration) {
                System.out.println("1.Collect Slip\n2.Exit");
                int answer = input.nextInt();

                switch (answer) {
                    case 1:
                        displayRegistrationSlip(student);
                        break;
                    case 2:
                        continueRegistration = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static Student registerStudent(Scanner input) {
        System.out.print("Full name: ");
        String fullName = input.nextLine();
        System.out.print("Id No: ");
        String id = input.nextLine();
        System.out.print("Department: ");
        String department = input.nextLine();

        int year = getValidInput("Year: ", input);
        int semester = validateSemester("Semester: ", input);

        System.out.println("****************************** Registered Successfully ! **********************************");
        input.nextLine(); // Consume the newline character

        return new Student(fullName, id, department, year, semester);
    }

    private static int getValidInput(String prompt, Scanner input) {
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                value = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // Clear the invalid input
            }
        }

        return value;
    }

    private static int validateSemester(String prompt,Scanner input) {
        int semester = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Semester (1 or 2): ");
                semester = input.nextInt();

                if (semester == 1 || semester == 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid semester. Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); // Clear the invalid input
            }
        }
        return semester;
      }
    private static void displayRegistrationSlip(Student student) {
        List<Course> studentCourseTable = Course.generateCourseTable(student);
        System.out.println("Name: " + student.getName() + "\t\tId No: " + student.getId());
        System.out.println("Department: " + capitalizeFirstLetter(student.getDep()) +
                "\t\tYear: " + student.getYear() + "\t\tsemester: " + student.getSemester());
        Course.displayCourseTable(studentCourseTable);
    }

    private static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}



     


