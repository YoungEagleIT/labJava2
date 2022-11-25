package Laba_2.task_3.service;

import Laba_2.task_2.ownServices.*;
import Laba_2.task_2.*;

public class addSubject {
    public static void ToGroup(final Group group, final Subject newSubject) {
        for (final Student student : group.getStudents()) {
            if (getSubjectByName.withStudent(student, newSubject.getName()) == null) {//check for already added subject
                student.getSubjects().put(newSubject, 0);
            }
        }
        if (getSubjectByName.withGroup(group, newSubject.getName()) == null)//check for already added subject
            group.getSubjects().add(newSubject);
    }
}