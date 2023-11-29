
import java.util.ArrayList;
import java.util.List;

class Course {
    // Class representing a course with a name and credit hours
    private final String courseName;
    private final int creditHours;
     // Constructor to initialize course name and credit hours
    public Course(String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
    }
    // Getter method for retrieving the course name
    public String getCourseName() {
        return courseName;
    }
    // Getter method for retrieving the credit hours
    public int getCreditHours() {
        return creditHours;
    }
    // Method to generate a course table based on the student's department, semester, and year

    public static List<Course> generateCourseTable(Student student) {
        // Create an empty course table
        List<Course> courseTable = new ArrayList<>();
        // Extract department, semester, and year information from the student
        String department = student.getDep().toLowerCase();
        int semester = student.getSemester();
        int year = student.getYear();
        // Display a header for the registration slip
        System.out.println("\n****************************** Here's Your Registration Slip  ! **********************************");
        // Use a switch statement to handle different departments
        switch (department) {
            case "software engineering":
            // Call a method to generate software engineering courses based on semester and year
                generateSoftwareEngineeringCourses(courseTable, semester, year);
                break;
            default:
             // Display a message for other departments and call a method to generate default courses
                System.out.println("\n****************************** Sorry! Your Slip is Not Ready. System is Under Building *****************************");
                generateDefaultCourses(courseTable);
        }

        return courseTable;
    }
 // Method to generate software engineering courses based on semester and year
    private static void generateSoftwareEngineeringCourses(List<Course> courseTable, int semester, int year) {
        // Use if-else statements to determine the courses based on semester and year
        if (semester == 2 && year == 1) {
            addCourses(courseTable,
                    new Course("Introduction to Programming", 3),
                    new Course("Introduction to Emerging Technology", 3),
                    new Course("Applied Mathematics", 3),
                    new Course("Civics", 2),
                    new Course("Entrepreneurship", 2),
                    new Course("Communicative English 2", 3)
            );
        } else if (semester == 1 && year == 2) {
            addCourses(courseTable,
                    new Course("Programming ||(Python)", 4),
                    new Course("Fundamental of Software Engineering", 3),
                    new Course("Fundamental of Database", 4),
                    new Course("Economics", 3),
                    new Course("Inclusiveness", 4),
                    new Course("Fundamental of Networking", 4),
                    new Course("Discrete Mathematics", 4)
            );
        } else if ((semester == 2 && year == 2) || (semester == 1 && year == 3) || (semester == 2 && year == 3)) {
            addCourses(courseTable,
                    new Course("Object Oriented Programming", 3),
                    new Course("Fundamental of Networking", 3),
                    new Course("Data Structures and Algorithm", 4),
                    new Course("Statistics", 3),
                    new Course("Computer Organization and Architecture", 3),
                    new Course("Operating System", 3)
            );
        } else {
            System.out.println("\n****************************** Sorry! Your Slip is Not Ready. System is Under Building *****************************");
            generateDefaultCourses(courseTable);
        }
    }
// Method to generate default courses when the department or year/semester is not supported

    private static void generateDefaultCourses(List<Course> courseTable) {
        addCourses(courseTable,
                new Course("N/A", 0),
                new Course("N/A", 0),
                new Course("N/A", 0),
                new Course("N/A", 0),
                new Course("N/A", 0),
                new Course("N/A", 0)
        );
    }

    private static void addCourses(List<Course> courseTable, Course... courses) {
        courseTable.addAll(List.of(courses));
    }
// Method to display the generated course table
    static void displayCourseTable(List<Course> courseTable) {
        System.out.println("------------------------------------------------");
        System.out.printf("%-30s %-15s%n", "Course Name", "Credit Hours");
        System.out.println("------------------------------------------------");
        for (Course course : courseTable) {
            System.out.printf("%-30s %-15d%n", course.getCourseName(), course.getCreditHours());
        }
        System.out.println("------------------------------------------------");
        System.out.println();
    }
}
























