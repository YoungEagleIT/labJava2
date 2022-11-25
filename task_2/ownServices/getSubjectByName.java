package Laba_2.task_2.ownServices;

import Laba_2.task_2.*;


public class getSubjectByName {

    public static Subject withStudent(final Student student, final String name) {
            for (final Subject key : student.getSubjects().keySet())
                    if(key.getName().equals(name)) {
                        return key;
                    }
        //System.out.println("Can`t find Subject with this name");
        return null;
    }

    public static Subject withGroup(final Group group, final String name) {
        for (final Subject subject : group.getSubjects()) {
            if (subject.getName().equals(name)) {
                return subject;
            }
        }
        //System.out.println("Can`t find Subject with this name");
        return null;
    }

}
