package za.ac.cput.domain;

/*
* Author:       Ethan Swart
* Student#:     220126283
* Last Edited: 2022/08/10
*/

public class Teacher extends User{
    
    //Attributes for Teacher Class
    private String userEmailAddress;
    private String userPassword;
    private String teacherFullName;
    private School teacherSchool;

    private Teacher() {

    }

    public static class Builder {
        //Attributes for Builder Class
        private String userEmailAddress;
        private String userPassword;
        private String teacherFullName;
        private School teacherSchool;

        //Builder Class Constructor
        public Builder() {

        }

        //Builder Returns
        public Builder theirUserEmailAddress(String userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }

        public Builder theirUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder theirTeacherFullName(String teacherFullName) {
            this.teacherFullName = teacherFullName;
            return this;
        }

        public Builder theirTeacherSchool (School teacherSchool) {
            this.teacherSchool = teacherSchool;
            return this;
        }

        //Build method
        public Teacher build() {
            Teacher teacher = new Teacher();
            teacher.userEmailAddress = this.userEmailAddress;
            teacher.userPassword = this.userPassword;
            teacher.teacherFullName = this.teacherFullName;
            teacher.teacherSchool = this.teacherSchool;
            return teacher;
        }
    }

    //Getters
    public String getTeacherFullName() {
        return teacherFullName;
    }

    public School getTeacherSchool() {
        return teacherSchool;
    }

    //toString method
    @Override
    public String toString() {
        return 
        "Teacher: userEmailAddress=" + userEmailAddress + 
        ", userPassword=" + userPassword +
        ", teacherFullName=" + teacherFullName +
        ", teacherSchool =" + teacherSchool.toString();
    }
}
