package Laba_2.task_2;

import java.util.Map;

public class Student {
    private String name;
    private Group group;
    private Map<Subject,Integer> subjects;

    public Student(final String name, final Group group, final Map<Subject, Integer> subjects) {
        this.name = name;
        this.group = group;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    public Map<Subject, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(final Map<Subject, Integer> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                " , group=" + group.getName() +
                " \n subjects=" + subjects +
                '}' + "\n";
    }
}

