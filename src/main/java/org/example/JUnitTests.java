package org.example;

import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * This class contains JUnit tests for the methods in the Student,
 * Lecturer, Module and CourseProgramme classes.
 */
public class JUnitTests {

    //JUnit test for the getUsername method in the student class
    @Test
    public void testStudentGetUsernameSuccessful(){
        Student student1 = new Student("John Doe", LocalDate.of(2000, Month.FEBRUARY, 18), 20347683);
        assertEquals("Student's username is JohnDoe22", "Student's username is "+student1.getUsername());
    }

    //JUnit test for the addModule and getModule methods in the student class
    @Test
    public void testStudentClassAddModule(){
        Student student2 = new Student("Rachel Joyce", LocalDate.of(1998, Month.MAY, 26), 18453704);
        Module module1 = new Module("Programming 1","CT123", "Marge Simpson");
        student2.addModule(module1);
        ArrayList<Module> modules = student2.getModules();
        assertEquals("Last element in module list for student Rachel Joyce is Programming 1", "Last element in module list for student Rachel Joyce is "+ (modules.get(modules.size()-1)).getName());
    }

    //JUnit test for the addModule and getCourses methods in the student class
    @Test
    public void testStudentClassAddCourses(){
        Student student3 = new Student("Jack Jones", LocalDate.of(2002, Month.NOVEMBER, 02), 20464273);
        CourseProgramme cp1 = new CourseProgramme("CS & IT",new DateTime(2021, 9, 1,0,0,0), new DateTime(2022,6,1,0,0,0));
        student3.addCourses(cp1);
        ArrayList<CourseProgramme> courses = student3.getCourses();
        assertEquals("Last element in courses list for student Jack Jones is CS & IT", "Last element in courses list for student Jack Jones is "+ (courses.get(courses.size()-1)).getName());
    }

    //JUnit test for the getUsername method in the Lecturer class
    @Test
    public void testLecturerGetUsernameSuccessful(){
        Lecturer lecturer1 = new Lecturer("Marge Simpson", LocalDate.of(1973, Month.JUNE, 11), 5482645);
        assertEquals("Lecturer's username is MargeSimpson49", "Lecturer's username is "+lecturer1.getUsername());
    }

    //JUnit test for the addModule and getModule methods in the Lecturer class
    @Test
    public void testLecturerClassAddModule(){
        Lecturer lecturer2 = new Lecturer("George Murphy", LocalDate.of(1982, Month.JANUARY, 05), 63957294);
        Module module2 = new Module("Professional Skills","CT321", "George Murphy");
        lecturer2.addModule(module2);
        ArrayList<Module> modules = lecturer2.getModules();
        assertEquals("Last element in module list for lecturer George Murphy is Professional Skills", "Last element in module list for lecturer George Murphy is "+ (modules.get(modules.size()-1)).getName());
    }

    //JUnit test for the addStudent and getStudent methods in the Module class
    @Test
    public void testModuleClassAddStudent(){
        Module module1 = new Module("Programming 1","CT123", "Marge Simpson");
        Student student1 = new Student("John Doe", LocalDate.of(2000, Month.FEBRUARY, 18), 20347683);
        module1.addStudent(student1);
        ArrayList<Student> students = module1.getStudents();
        assertEquals("Last element in student list for module CT123 is JohnDoe22", "Last element in student list for module CT123 is "+ (students.get(students.size()-1)).getUsername());
    }

    //JUnit test for the addCourses and getCourses methods in the Module class
    @Test
    public void testModuleClassAddCourse(){
        Module module2 = new Module("Professional Skills","CT321", "George Murphy");
        CourseProgramme cp1 = new CourseProgramme("CS & IT",new DateTime(2021, 9, 1,0,0,0), new DateTime(2022,6,1,0,0,0));
        module2.addCourse(cp1);
        ArrayList<CourseProgramme> courses = module2.getCourses();
        assertEquals("Last element in course list for module CT321 is CS & IT", "Last element in course list for module CT321 is "+ (courses.get(courses.size()-1)).getName());
    }

    //JUnit test for the addModule and getModule methods in the CourseProgramme class
    @Test
    public void testCourseProgrammeAddModule(){
        CourseProgramme cp1 = new CourseProgramme("CS & IT",new DateTime(2021, 9, 1,0,0,0), new DateTime(2022,6,1,0,0,0));
        Module module1 = new Module("Programming 1","CT123", "Marge Simpson");
        cp1.addModule(module1);
        ArrayList<Module> modules = cp1.getModules();
        assertEquals("Last element in module list for course CS & IT is Programming 1", "Last element in module list for course CS & IT is "+ (modules.get(modules.size()-1)).getName());
    }

    //JUnit test for the addStudent and getStudents methods in the CourseProgramme class
    @Test
    public void testCourseProgrammeAddStudent(){
        CourseProgramme cp2 = new CourseProgramme("ECE",new DateTime(2021, 9, 6,0,0,0), new DateTime(2022,7,1,0,0,0));
        Student student1 = new Student("John Doe", LocalDate.of(2000, Month.FEBRUARY, 18), 20347683);
        cp2.addStudent(student1);
        ArrayList<Student> students = cp2.getStudents();
        assertEquals("Last element in student list for course ECE is JohnDoe22", "Last element in student list for course ECE is "+ (students.get(students.size()-1)).getUsername());
    }
}
