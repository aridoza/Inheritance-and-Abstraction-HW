package com.ga;

import java.util.Arrays;
import java.util.LinkedList;

public class FourthGrade implements Classroom {
    private boolean dressShoesRequired = true;
    private LinkedList<String> gamesAllowed = new LinkedList<>(Arrays.asList("Legos", "Cards", "Jigsaw Puzzle"));
    private LinkedList<String> studentJobs = new LinkedList<>(Arrays.asList("Class President", "Class Vice President", "Class Treasurer", "Textbook Manager", "Cleanup Manager"));

    @Override
    public int getNumberOfStudents() {
        return 28;
    }

    @Override
    public int getClassroomNumber() {
        return 112;
    }

    @Override
    public String getGradeLevel() {
        return "Fourth";
    }

    @Override
    public LinkedList<String> getSubjects() {
        LinkedList<String> subjects = new LinkedList<>(Arrays.asList("Algebra Plus", "Spanish", "Prehistoric Era", "History of the Antarctic", "English 1"));
        return subjects;
    }

    @Override
    public String headTeacher() {
        return "Mr. Fourman";
    }

    @Override
    public String secondaryTeacher() {
        return "Mrs. Cuatro";
    }

    public boolean isDressShoesRequired() {
        return dressShoesRequired;
    }

    public LinkedList<String> getGamesAllowed() {
        return gamesAllowed;
    }

    public LinkedList<String> getStudentJobs() {
        return studentJobs;
    }

    public void setStudentJobs(LinkedList<String> studentJobs) {
        this.studentJobs = studentJobs;
    }
}
