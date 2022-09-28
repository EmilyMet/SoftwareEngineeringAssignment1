package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Lecturer {
    private String name, username;
    private LocalDate DOB, currentDate;
    private int age, ID;
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Lecturer(String name, LocalDate DOB, int ID){
        this.name = name;
        this.ID = ID;
        this.DOB = DOB;
        currentDate = LocalDate.now();
        age = Period.between(DOB, currentDate).getYears();
    }

    //Method to create the lecturer's username from their name and age
    public String getUsername(){
        String nameNoSPace = name.replaceAll(" ", "");
        username = nameNoSPace + age;
        return username;
    }

    //Method to add a module to the lecturer's module list
    public void addModule(Module m){
        modules.add(m);
    }

    //Method to get the lecturer's module list
    public ArrayList getModules(){
        return modules;
    }
}
