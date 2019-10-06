package com.ga;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class ThirdGrade implements Classroom {
    private LinkedList<String> booksList = new LinkedList<>(Arrays.asList("The Day You Begin", "How To Be A Lion", "A House That Once Was", "No Boring Stories!"));
    private ArrayList<String> allowedSnacks = new ArrayList<>(Arrays.asList("goldfish", "animal crackers", "baked chips", "kale chips"));

    @Override
    public int getNumberOfStudents() {
        return 30;
    }

    @Override
    public int getClassroomNumber() {
        return 110;
    }

    @Override
    public String getGradeLevel() {
        return "Third";
    }

    @Override
    public LinkedList<String> getSubjects() {
        LinkedList<String> subjects = new LinkedList<>(Arrays.asList("Penmanship", "Intro to Computers", "Algebra", "Medieval History", "Astronomy"));
        return subjects;
    }

    @Override
    public String headTeacher() {
        return "Ms. Thirdly";
    }

    @Override
    public String secondaryTeacher() {
        return "Mr. Tercero";
    }

    public LinkedList<String> getBooksList() {
        return booksList;
    }

    public ArrayList<String> getAllowedSnacks() {
        return allowedSnacks;
    }
}
