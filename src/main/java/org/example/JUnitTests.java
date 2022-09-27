package org.example;

import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class JUnitTests {

    //JUnit test for the getUsername method in the student class
    @Test
    public void testStudentGetUsernameSuccessful(){
        Student student1 = new Student("John Doe", LocalDate.of(2000, Month.FEBRUARY, 18), 20347683);
        assertEquals("Student's username is John Doe22", "Student's username is "+student1.getUsername());
    }

    //JUnit test for the addModule and getModule methods in the student class
    @Test
    public void testStudentClassAddModule(){
        Student student2 = new Student("Rachel Joyce", LocalDate.of(1998, Month.MAY, 26), 18453704);
        student2.addModule("Intro to Physics");
        student2.addModule("Software Engineering 3");
        ArrayList<String> modules = student2.getModules();
        assertEquals("Last element in module list for student Rachel Joyce is Software Engineering 3", "Last element in module list for student Rachel Joyce is "+modules.get(modules.size()-1));
    }

    //JUnit test for the addModule and getCourses methods in the student class
    @Test
    public void testStudentClassAddCourses(){
        Student student3 = new Student("Jack Jones", LocalDate.of(2002, Month.NOVEMBER, 02), 20464273);
        student3.addCourses("CS & IT");
        ArrayList<String> courses = student3.getCourses();
        assertEquals("Last element in courses list for student Jack Jones is CS & IT", "Last element in courses list for student Jack Jones is "+courses.get(courses.size()-1));
    }

    //JUnit test for the getUsername method in the Lecturer class
    @Test
    public void testLecturerGetUsernameSuccessful(){
        Lecturer lecturer1 = new Lecturer("Marge Simpson", LocalDate.of(1973, Month.JUNE, 11), 5482645);
        assertEquals("Lecturer's username is Marge Simpson49", "Lecturer's username is "+lecturer1.getUsername());
    }

    //JUnit test for the addModule and getModule methods in the Lecturer class
    @Test
    public void testLecturerClassAddModule(){
        Lecturer lecturer2 = new Lecturer("George Murphy", LocalDate.of(1982, Month.JANUARY, 05), 63957294);
        lecturer2.addModule("Professional Skills");
        lecturer2.addModule("Machine Learning");
        ArrayList<String> modules = lecturer2.getModules();
        assertEquals("Last element in module list for lecturer George Murphy is Machine Learning", "Last element in module list for lecturer George Murphy is "+modules.get(modules.size()-1));
    }

    //JUnit test for the addStudent and getStudent methods in the Module class
    @Test
    public void testModuleClassAddStudent(){
        Module module1 = new Module("Programming 1","CT123", "Marge Simpson");
        module1.addStudent("Jack Smith");
        ArrayList<String> students = module1.getStudents();
        assertEquals("Last element in student list for module CT123 is Jack Smith", "Last element in student list for module CT123 is "+students.get(students.size()-1));
    }

    //JUnit test for the addCourses and getCourses methods in the Module class
    @Test
    public void testModuleClassAddCourse(){
        Module module2 = new Module("Professional Skills","CT321", "George Murphy");
        module2.addCourse("CS & IT");
        module2.addCourse("ECE");
        ArrayList<String> courses = module2.getCourses();
        assertEquals("Last element in course list for module CT321 is ECE", "Last element in course list for module CT321 is "+courses.get(courses.size()-1));
    }

    //JUnit test for the addModule and getModule methods in the CourseProgramme class
    @Test
    public void testCourseProgrammeAddModule(){
        CourseProgramme cp1 = new CourseProgramme("CS & IT",new DateTime(2021, 9, 1,0,0,0), new DateTime(2022,6,1,0,0,0));
        cp1.addModule("Programming 1");
        ArrayList<String> modules = cp1.getModules();
        assertEquals("Last element in module list for course CS & IT is Programming 1", "Last element in module list for course CS & IT is "+modules.get(modules.size()-1));
    }

    //JUnit test for the addStudent and getStudents methods in the CourseProgramme class
    @Test
    public void testCourseProgrammeAddStudent(){
        CourseProgramme cp2 = new CourseProgramme("ECE",new DateTime(2021, 9, 6,0,0,0), new DateTime(2022,7,1,0,0,0));
        cp2.addStudent("John Doe");
        cp2.addStudent("Rachel Joyce");
        ArrayList<String> students = cp2.getStudents();
        assertEquals("Last element in student list for course ECE is Rachel Joyce", "Last element in student list for course ECE is "+students.get(students.size()-1));
    }
}
