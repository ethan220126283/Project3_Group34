package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Teacher;
import za.ac.cput.factory.TeacherFactory;

import static org.junit.jupiter.api.Assertions.*;

class TeacherFactoryTest {

    @Test
    void createTeacher() {
        Teacher teacher = TeacherFactory.createTeacher(
                "john@mail.com",
                "password",
                "John Green"
        );
        System.out.println(teacher.toString());
        assertNotNull(teacher);
    }
}