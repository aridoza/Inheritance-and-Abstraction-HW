package com.ga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SecondGrade implements Classroom {
    private ArrayList<String> computerBrandsProvided = new ArrayList<>(Arrays.asList("Dell", "HP", "Lenovo"));
    private int minimumGradeRequired = 87;
    private boolean uniformsRequired = true;

    @Override
    public int getNumberOfStudents() {
        return 25;
    }

    @Override
    public int getClassroomNumber() {
        return 106;
    }

    @Override
    public String getGradeLevel() {
        return "Second";
    }

    @Override
    public LinkedList<String> getSubjects() {
        LinkedList<String> subjects = new LinkedList<>(Arrays.asList("Math", "Science", "History", "Social Studies"));
        return subjects;
    }

    @Override
    public String headTeacher() {
        return "Mr. Secondman";
    }

    @Override
    public String secondaryTeacher() {
        return "Mr. Segundoman";
    }

    public LinkedList<String> classTrips() {
        LinkedList<String> destinations = new LinkedList<>(Arrays.asList("Aquarium", "Museum", "Planetarium", "Zoo"));
        return destinations;
    }

    public ArrayList<String> getComputerBrandsProvided() {
        return computerBrandsProvided;
    }

    public int getMinimumGradeRequired() {
        return minimumGradeRequired;
    }

    public boolean isUniformsRequired() {
        return uniformsRequired;
    }
}
