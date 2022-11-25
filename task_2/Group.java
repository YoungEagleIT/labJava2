package Laba_2.task_2;

import java.util.List;

public class Group {
    private List<Student> students;
    private String name;
    private List<Subject> subjects;
    private List<Timetable> timetable;

    public Group(final List<Student> students, final String name, final List<Subject> subjects, final  List<Timetable> timetable) {
        this.students = students;
        this.name = name;
        this.subjects = subjects;
        this.timetable = timetable;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public  List<Timetable> getTimetable() {
        return timetable;
    }

    public void setTimetable(final  List<Timetable> timetable) {
        this.timetable = timetable;
    }

    @Override
    public String toString() {
        return "\n"+ "\n Group{" +
                "name='" + name  +
                "\n students=" + students +
                ", subjects=" + subjects +
                ", timetable=" + timetable +
                '}';
    }
}
