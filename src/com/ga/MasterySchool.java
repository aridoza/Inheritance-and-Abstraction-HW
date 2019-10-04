package com.ga;

public class MasterySchool extends School {
    @Override
    public String Classroom() {
        return "The Mastery School";
    }

    @Override
    public int numberOfFloors() {
        return 3;
    }

    @Override
    public int numberOfClassrooms() {
        return 30;
    }
}
