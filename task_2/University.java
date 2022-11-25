package Laba_2.task_2;

import java.util.List;

public class University {
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public University(final List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "University{" +
                "groups=" + groups +
                '}';
    }
}
