package Laba_2.task_2;

import Laba_2.task_3.service.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task_2 {
    public static void main(final String[] args) {

        final Subject subject1 = new Subject("Math");
        final Subject subject2 = new Subject("Java");
        final Subject subject3 = new Subject("PE");

        final Timetable timetable1 = new Timetable(LocalDate.of(2021, 9, 22), subject1, null);
        final Timetable timetable2 = new Timetable(LocalDate.of(2021, 9, 23), subject2, null);
        final Timetable timetable3 = new Timetable(LocalDate.of(2021, 9, 22), subject3, null);
        final Timetable timetable4 = new Timetable(LocalDate.of(2021, 9, 23), subject1, null);

        final Group group1 = new Group(new ArrayList<>(), "IT-21", Stream.of(subject1, subject2, subject3).collect(Collectors.toList()), Stream.of(timetable1, timetable2).collect(Collectors.toList()));
        final Group group2 = new Group(new ArrayList<>(), "IT-22", Stream.of(subject1, subject2, subject3).collect(Collectors.toList()), Stream.of(timetable3, timetable4).collect(Collectors.toList()));

        addGroupToTimetable(group1, timetable1);
        addGroupToTimetable(group1, timetable2);
        addGroupToTimetable(group2, timetable3);
        addGroupToTimetable(group2, timetable4);

        final Student student1 = new Student("Nazar", group1, new HashMap<>());
        addSubjectToStudent(student1, 99);

        final Student student2 = new Student("Liubomyr", group2, new HashMap<>());
        addSubjectToStudent(student2, 88);


        group1.getStudents().addAll(Stream.of(student1).collect(Collectors.toList()));
        group2.getStudents().addAll(Stream.of(student2).collect(Collectors.toList()));

        final University university = new University(new ArrayList<>());
        university.setGroups(Stream.of(group1, group2).collect(Collectors.toList()));
        System.out.println(university);


        //Testing task_3

        final Subject newSubject1 = new Subject("OIT");
        addSubject.ToGroup(group1, newSubject1);
        System.out.println(university);

        addToTimetable.newLesson(group1,"OIT",LocalDate.of(2022,9,25));
        System.out.println(university);

        sortStudents.inAlphabetOrder(university);
        System.out.println(university);

        System.out.println("\nSorted students:");
        final List<Student> sortedList = getStudents.withSameSubject(university,"OIT");
        System.out.println(sortedList);
    }

    public static void addSubjectToStudent(final Student student, final int mark) {
        student.getSubjects().put(new Subject("Math"), mark);
        student.getSubjects().put(new Subject("Java"), mark);
        student.getSubjects().put(new Subject("PE"), mark);
    }

    public static void addGroupToTimetable(final Group group, final Timetable timetable) {
        timetable.setGroup(group);
    }
}
