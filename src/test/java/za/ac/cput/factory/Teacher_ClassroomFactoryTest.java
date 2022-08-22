package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Teacher_Classroom;

import static org.junit.jupiter.api.Assertions.*;

class Teacher_ClassroomFactoryTest {

    @Test
    void createTeacher_Classroom() {
        Teacher_Classroom teacher_classroom = Teacher_ClassroomFactory.createTeacher_Classroom(
                "john@mail.com",
                1
        );
        System.out.println(teacher_classroom.toString());
        assertNotNull(teacher_classroom);
    }
}