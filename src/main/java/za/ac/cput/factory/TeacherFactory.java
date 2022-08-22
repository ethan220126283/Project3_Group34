package za.ac.cput.factory;

import za.ac.cput.domain.Teacher;
import za.ac.cput.util.Helper;

public class TeacherFactory {

    public static Teacher createTeacher(String teacherEmailAddress, String teacherPassword, String teacherName) {

        //Validation
        if (Helper.isNullorEmpty(teacherName) || Helper.isNullorEmpty(teacherName) ){
            throw new IllegalArgumentException("teacherEmail and teacherName mandatory attributes.");
        }

        //Return
        return new Teacher.Builder()
        .theirTeacherEmailAddress(teacherEmailAddress)
        .theirTeacherPassword(teacherPassword)
        .theirTeacherName(teacherName)
        .build();
    }

}