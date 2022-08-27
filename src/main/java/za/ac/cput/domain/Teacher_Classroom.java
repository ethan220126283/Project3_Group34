package za.ac.cput.domain;

/*
 * Author:       Ethan Swart
 * Student#:     220126283
 * Last Edited: 2022/08/10
 */

import java.util.Objects;

public class Teacher_Classroom {

    //Attributes for Teacher_Classroom
    private String teacher_email;
    private int classroom_id;

    //Private constructor
    private Teacher_Classroom() {}

    public static class Builder{

        //Attributes for Builder class
        private String teacher_email;
        private int classroom_id;

        //Builder constructor
        public Builder() {}

        //Builder returns
        public Builder theirTeacher_Email(String teacher_email) {
            this.teacher_email = teacher_email;
            return this;
        }

        public Builder theirClassroom_Id(int classroom_id){
            this.classroom_id = classroom_id;
            return this;
        }

        //Build method
        public Teacher_Classroom build() {
            Teacher_Classroom teacher_classroom = new Teacher_Classroom();
            teacher_classroom.teacher_email = this.teacher_email;
            teacher_classroom.classroom_id = this.classroom_id;
            return teacher_classroom;
        }
    }

    //toString method
    @Override
    public String toString() {
        return "Teacher_Classroom{" +
                "teacher_email='" + teacher_email + '\'' +
                ", classroom_id=" + classroom_id +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher_Classroom that = (Teacher_Classroom) o;
        return classroom_id == that.classroom_id && Objects.equals(teacher_email, that.teacher_email);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(teacher_email, classroom_id);
    }

    //Getters
    public String getTeacher_email() {return teacher_email;}

    public int getClassroom_id() {return classroom_id;}
}
