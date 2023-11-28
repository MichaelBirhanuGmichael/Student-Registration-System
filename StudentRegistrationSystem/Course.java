
import java.util.ArrayList;
import java.util.List;

class Course {
    private final String courseName;
    private final int creditHours;

    public Course(String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public static List<Course> generateCourseTable(Student student) {
        List<Course> courseTable = new ArrayList<>();

        String department = student.getDep().toLowerCase();
        int semester = student.getSemester();
        int year = student.getYear();

        System.out.println("\n****************************** Here's Your Registration Slip  ! **********************************");

        switch (department) {
            case "software engineering":
                generateSoftwareEngineeringCourses(courseTable, semester, year);
                break;
            default:
                System.out.println("\n****************************** Sorry! Your Slip is Not Ready. System is Under Building *****************************");
                generateDefaultCourses(courseTable);
        }

        return courseTable;
    }

    private static void generateSoftwareEngineeringCourses(List<Course> courseTable, int semester, int year) {
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























// package Registerationsystem;

// import java.util.ArrayList;
// import java.util.List;

// class Course {
//   private String courseName;
//   private int creditHours;

//   public Course(String courseName, int creditHours) {
//       this.courseName = courseName;
//       this.creditHours = creditHours;
//   }
   
//   public String getCourseName() {
//       return courseName;
//   }

//   public int getCreditHours() {
//       return creditHours;   
//   }
//   public static List<Course> generateCourseTable(Student student) {
//             List<Course> courseTable = new ArrayList<>();

//         // Check the department of the student and populate the course table accordingly
//         String department = student.getDep();
//         int Year  = student.getYear();
//         int Semester = student.getSemester();
//         if ("Software Engineering".equalsIgnoreCase(department) && Semester == 2 && Year == 1) {
//             System.out.println("\n****************************** Here's Your Registeration Slip  ! **********************************");
//             courseTable.add(new Course("Introduction to Programming ", 3));
//             courseTable.add(new Course("Introduction to Emerging Technology", 3));
//             courseTable.add(new Course("Applied Mathematics" , 3));
//             courseTable.add(new Course("Civics" , 2));
//             courseTable.add(new Course("Entrepreneurship " , 2));
//             courseTable.add(new Course("Communicative English 2 " , 3));

//         }  else if ("Software Engineering".equalsIgnoreCase(department) && Semester == 1 && Year == 2 ) {
//             System.out.println("\n****************************** Here's Your Registeration Slip  ! **********************************");
//             courseTable.add(new Course("Programming ||(Python)", 4));
//             courseTable.add(new Course("Fundamental of Software Engineering", 3));
//             courseTable.add(new Course("Fundamental of Database " , 4));
//             courseTable.add(new Course("Economics" , 3));
//             courseTable.add(new Course("Inclusiveness " , 4));
//             courseTable.add(new Course("Fundamental of Networking " , 4));
//             courseTable.add(new Course("Discrete Mathematics " , 4));
//         }
//         else if ("Software Engineering".equalsIgnoreCase(department) && Semester == 2 && Year == 2 ) {
//             System.out.println("\n****************************** Here's Your Registeration Slip  ! **********************************");
//             courseTable.add(new Course("Object Oriented Programming " , 3));
//             courseTable.add(new Course("Fundamental of Networking " , 3));
//             courseTable.add(new Course("Data Structures and Algorithm " , 4));
//             courseTable.add(new Course("Statistics " , 3));
//             courseTable.add(new Course("Computer Organization and Architecture " , 3));
//             courseTable.add(new Course("Operating System" , 3));
          
//         }else if ("Software Engineering".equalsIgnoreCase(department) && Semester == 1 && Year == 3 ) {
//             System.out.println("\n****************************** Here's Your Registeration Slip  ! **********************************");
//             courseTable.add(new Course("Object Oriented Programming " , 3));
//             courseTable.add(new Course("Fundamental of Networking " , 3));
//             courseTable.add(new Course("Data Structures and Algorithm " , 4));
//             courseTable.add(new Course("Statistics " , 3));
//             courseTable.add(new Course("Computer Organization and Architecture " , 3));
//             courseTable.add(new Course("Operating System" , 3));
          
//         }
//         else if ("Software Engineering".equalsIgnoreCase(department) && Semester == 2 && Year == 3 ) {
//             System.out.println("\n****************************** Here's Your Registeration Slip  ! **********************************");
//             courseTable.add(new Course("Object Oriented Programming " , 3));
//             courseTable.add(new Course("Fundamental of Networking " , 3));
//             courseTable.add(new Course("Data Structures and Algorithm " , 4));
//             courseTable.add(new Course("Statistics " , 3));
//             courseTable.add(new Course("Computer Organization and Architecture " , 3));
//             courseTable.add(new Course("Operating System" , 3));
          
//         }
//         else{
//             System.out.println("\n****************************** Sorry!Your Slip is Not Ready System is Under Building *****************************");
//             courseTable.add(new Course("N/A" , 0));
//             courseTable.add(new Course("N/A" , 0));
//             courseTable.add(new Course("N/A" , 0));
//             courseTable.add(new Course("N/A" , 0));
//             courseTable.add(new Course("N/A" , 0));
//             courseTable.add(new Course("N/A" , 0));
//         }

//         return courseTable;
//   }
//   static void displayCourseTable(List<Course> courseTable) {
    
//     // will display the courses in table form
//     System.out.println("------------------------------------------------");
//     System.out.printf("%-30s %-15s%n", "Course Name", "Credit Hours");
//     System.out.println("------------------------------------------------");
//     for (Course course : courseTable) {
//         System.out.printf("%-30s %-15d%n", course.getCourseName(), course.getCreditHours());
//     }
//     System.out.println("------------------------------------------------");
//     System.out.println();
// } 
// } 
