package Laba_2.task_2.ownServices;

import Laba_2.task_2.*;

public class getStudent {

    public static   Student ByNameWithGroup(final String name,final Group group)
    {
        for(final Student student : group.getStudents()){
            if(student.getName().equals(name)){
                return student;
            }
        }
        System.out.println("Can`t find Student with this name");
        return null;
    }

    public static   Student ByNameWithUniversity(final String name,final University university)
    {
        for(final Group group : university.getGroups()){
            for(final Student student: group.getStudents())
            if(student.getName().equals(name)){
                return student;
            }
        }
        System.out.println("Can`t find Student with this name");
        return null;
    }
}
