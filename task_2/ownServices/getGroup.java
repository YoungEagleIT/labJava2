package Laba_2.task_2.ownServices;

import Laba_2.task_2.*;


public class getGroup {
    private final University university;
    private final String name;

    public getGroup(final University university, final String name) {
        this.university = university;
        this.name = name;
    }

    public Group getGroupByName() {
        for (final Group group : university.getGroups()) {
            if (group.getName().equals(name)) {
                return group;
            }
        }
        System.out.println("Can`t find group with this name");
        return null;
    }
}
