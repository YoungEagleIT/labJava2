package Laba_2.task_3.service;

import Laba_2.task_2.*;
import Laba_2.task_2.ownServices.*;

import java.util.ArrayList;
import java.util.List;

public class getStudents {

    public static List<Student> withSameSubject(final University university, final String subjectName) {
        final List<Student> newlist = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            final Subject neededSubject = getSubjectByName.withGroup(group, subjectName);
            for (final Student student : group.getStudents()) {
                if (student.getSubjects().containsKey(neededSubject)) {
                    newlist.add(student);
                }
            }
        }
        return newlist;
    }
}