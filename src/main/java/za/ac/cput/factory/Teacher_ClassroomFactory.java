package za.ac.cput.factory;

import za.ac.cput.domain.Teacher_Classroom;
import za.ac.cput.util.Helper;

public class Teacher_ClassroomFactory {

    public static Teacher_Classroom createTeacher_Classroom(String teacher_email, int classroom_id) {

        //Validation
        if (Helper.isNullorEmpty(teacher_email) || Helper.isZero(classroom_id) ){
            throw new IllegalArgumentException("teacher_email and classroom_id mandatory attributes.");
        }

        //Return
        return new Teacher_Classroom.Builder()
                .theirTeacher_Email(teacher_email)
                .theirClassroom_Id(classroom_id)
                .build();
    }
}
