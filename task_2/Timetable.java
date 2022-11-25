package Laba_2.task_2;

import java.time.LocalDate;

public class Timetable {
    private LocalDate date;
    private Subject subject;

    private Group group;

    public Timetable(final LocalDate date, final Subject subject, final Group group) {
        this.date = date;
        this.subject = subject;
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(final Subject subject) {
        this.subject = subject;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "group=" + group.getName() +
                ", subject=" + subject.getName() +
                ", date=" + date +
                '}';
    }
}
