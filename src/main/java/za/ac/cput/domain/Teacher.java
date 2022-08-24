package za.ac.cput.domain;

/*
* Author:       Ethan Swart
* Student#:     220126283
* Last Edited: 2022/08/22
*/

import java.util.Objects;

public class Teacher {
    
    //Attributes for Teacher Class
    private String teacher_email;
    private String teacher_password;
    private String teacher_name;

    private Teacher() {}

    public static class Builder {
        //Attributes for Builder Class
        private String teacher_email;
        private String teacher_password;
        private String teacher_name;

        //Builder Class Constructor
        public Builder() {}

        //Builder Returns
        public Builder theirTeacher_Email(String teacher_email) {
            this.teacher_email = teacher_email;
            return this;
        }

        public Builder theirTeacher_Password(String teacher_password) {
            this.teacher_password = teacher_password;
            return this;
        }

        public Builder theirTeacher_Name(String teacher_name) {
            this.teacher_name = teacher_name;
            return this;
        }


        //Build method
        public Teacher build() {
            Teacher teacher = new Teacher();
            teacher.teacher_email = this.teacher_email;
            teacher.teacher_password = this.teacher_password;
            teacher.teacher_name = this.teacher_name;
            return teacher;
        }
    }

    //Getters
    public String getTeacher_Name() {
        return teacher_name;
    }

    //toString method
    @Override
    public String toString() {
        return 
        "Teacher: teacher_email=" + teacher_email +
        ", teacher_password=" + teacher_password +
        ", teacher_name=" + teacher_name;
    }

    //equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacher_email, teacher.teacher_email) && teacher_password.equals(teacher.teacher_password) && Objects.equals(teacher_name, teacher.teacher_name);
    }

    //hashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(teacher_email, teacher_password, teacher_name);
    }
}
