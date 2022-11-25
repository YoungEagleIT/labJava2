package Laba_2.task_4;

import Laba_2.task_2.*;
import Laba_2.task_2.ownServices.*;

import java.util.Map;
import java.util.stream.Collectors;

public class Journal {
    private Student student;
    private Map<Subject, Integer> mark;

    public Journal(final Student student, final Map<Subject, Integer> mark) {
        this.student = student;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }

    public Map<Subject, Integer> getMark() {
        return mark;
    }

    public void setMark(final Map<Subject, Integer> mark) {
        this.mark = mark;
    }

    public void addMark(final String subjectName, final Integer newMark) {

        student.getSubjects()
                .entrySet()
                .stream()
                .distinct()
                .filter(e -> e.getKey().getName().equals(subjectName))
                .peek(mark -> mark.setValue(mark.getValue() + newMark))
                .collect(Collectors.toSet());
    }

    public void changeMark(final String subjectName, final Integer newMark) {

        student.getSubjects()
                .entrySet()
                .stream()
                .distinct()
                .filter(e -> e.getKey().getName().equals(subjectName))
                .peek(mark -> mark.setValue(newMark))
                .collect(Collectors.toSet());

    }

    public void deleteMark(final String subjectName) {

        student.getSubjects()
                .entrySet()
                .stream()
                .distinct()
                .filter(e -> e.getKey().getName().equals(subjectName))
                .peek(mark -> mark.setValue(0))
                .collect(Collectors.toSet());

    }

    public void displayAllMarksAllStudent(final University university) {
university.getGroups().
        stream().
        distinct().
        forEach(group-> group.getStudents()
                .stream()
                .forEach(student->student.getSubjects()
                        .entrySet()
                        .stream()
                        .distinct()
                        .forEach(entry->entry.getValue())));

        for (final Group group : university.getGroups()) {
            for (final Student oldStudent : group.getStudents()) {
                oldStudent.getSubjects()
                        .entrySet()
                        .stream()
                        .distinct()
                        .forEach(mark->System.out.println(oldStudent.getName()+"\n"+mark));
            }
        }
    }

    public void displayAllMarksOneStudent() {
        student.getSubjects()
                .entrySet()
                .stream()
                .distinct()
                .forEach(mark->System.out.println(student.getName() + "\n" +mark));
    }

    public void displayAllMarksSameSubject(final University university, final String subjectName) {
        for (final Group group : university.getGroups()) {
            for (final Student newStudent : group.getStudents()) {
                newStudent.getSubjects()
                        .entrySet()
                        .stream()
                        .distinct().
                        filter(e -> e.getKey().getName().equals(subjectName))
                        .forEach(mark -> System.out.println(newStudent.getName()+"\n" + mark));
            }
        }

    }
}
