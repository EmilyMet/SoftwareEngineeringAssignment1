package org.example;

import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class JUnitTests {

    @Test
    public void testStudentGetNameSuccessful(){
        Student student1 = new Student("John Doe", LocalDate.of(2000, Month.FEBRUARY, 18), 20347683);
        assertEquals("Student's username is John Doe22", "Student's username is "+student1.getUsername());
    }

    @Test
    public void testLecturerGetNameSuccessful(){
        Lecturer lecturer1 = new Lecturer("Marge Simpson", LocalDate.of(1973, Month.JUNE, 11), 5482645);
        assertEquals("Lecturer's username is Marge Simpson49", "Lecturer's username is "+lecturer1.getUsername());
    }

    @Test
    public void testModuleAddStudent(){
        Module module1 = new Module("Programming 1","CT123", "Marge Simpson");
        module1.addStudent("Jack Smith");
        ArrayList<String> students = module1.getStudents();
        assertEquals("Last element in student list for module CT123 is Jack Smith", "Last element in student list for module CT123 is "+students.get(students.size()-1));
    }

    @Test
    public void testCourseProgrammeAddModule(){
        CourseProgramme cp1 = new CourseProgramme("CS & IT",new DateTime(2021, 9, 1,0,0,0), new DateTime(2022,6,1,0,0,0));
        cp1.addModule("Programming 1");
        ArrayList<String> modules = cp1.getModules();
        assertEquals("Last element in module list for course CS & IT is Programming 1", "Last element in module list for course CS & IT is "+modules.get(modules.size()-1));
    }
}
