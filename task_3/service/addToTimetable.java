package Laba_2.task_3.service;

import Laba_2.task_2.*;
import Laba_2.task_2.ownServices.*;

import java.time.LocalDate;

public class addToTimetable {
    public static void newLesson(final Group group, final String subjectName, final LocalDate date) {
        final Subject newSubject = getSubjectByName.withGroup(group, subjectName);
        if (newSubject == null) {
            addSubject.ToGroup(group, new Subject(subjectName));
        }
        group.getTimetable().add(new Timetable(date, newSubject, group));
    }


    public static void newLesson(final Group group, final Subject subject, final LocalDate date) {
        newLesson(group, subject.getName(), date);
    }
}