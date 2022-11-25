package Laba_2.task_3.service;

import Laba_2.task_2.*;

import java.util.Comparator;

public class sortStudents {
    public static void inAlphabetOrder(final University university) {
        for (final Group group : university.getGroups()) {
            group.getStudents().sort(Comparator.comparing(Student::getName));
        }
    }
}

