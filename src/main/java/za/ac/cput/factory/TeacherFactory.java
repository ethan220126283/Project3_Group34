package za.ac.cput.factory;

import za.ac.cput.domain.Teacher;
import za.ac.cput.util.Helper;

public class TeacherFactory {

    public static Teacher createTeacher(String teacher_email, String teacher_password, String teacher_name) {

        //Validation
        if (Helper.isNullorEmpty(teacher_email) || Helper.isNullorEmpty(teacher_name) ){
            throw new IllegalArgumentException("teacher_email and teacher_name mandatory attributes.");
        }

        //Return
        return new Teacher.Builder()
        .theirTeacher_Email(teacher_email)
        .theirTeacher_Password(teacher_password)
        .theirTeacher_Name(teacher_name)
        .build();
    }

}