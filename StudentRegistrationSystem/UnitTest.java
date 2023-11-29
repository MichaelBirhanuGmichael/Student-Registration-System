import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class UnitTest {

    @Test
    void generateCourseTable() {
        // Create a sample student
        Student student = new Student("John Doe", "2389/14","Software Engineering", 1, 2);

        // Generate the course table
        List<Course> courseTable = Course.generateCourseTable(student);

        // Validate the generated course table
        assertNotNull(courseTable);
        assertFalse(courseTable.isEmpty());

    
    }
        @Test
    void testStudentConstructorAndGetters() {
        // Create a sample student
        Student student = new Student("John Doe", "4965/14", "Software Engineering", 2, 1);

        // Validate the constructor and getters
        assertEquals("John Doe", student.getName());
        assertEquals("4965/14", student.getId());
        assertEquals("Software Engineering", student.getDep());
        assertEquals(2, student.getYear());
        assertEquals(1, student.getSemester());
    }

    @Test
    void testSetters() {
        // Create a sample student
        Student student = new Student();

        // Use setters to set values
        student.setName("Jane Doe");
        student.setId("1234/14");
        student.setDep("Computer Science");
        student.setYear(3);
        student.setSemester(2);

        // Validate the setters
        assertEquals("Jane Doe", student.getName());
        assertEquals("1234/14", student.getId());
        assertEquals("Computer Science", student.getDep());
        assertEquals(3, student.getYear());
        assertEquals(2, student.getSemester());
    }
}


