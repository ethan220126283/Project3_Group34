package za.ac.cput.domain;

/*
* Author:       Ethan Swart
* Student#:     220126283
* Last Edited: 2022/08/10
*/

public class Teacher {
    
    //Attributes for Teacher Class
    private String teacherEmailAddress;
    private String teacherPassword;
    private String teacherName;

    private Teacher() {

    }

    public static class Builder {
        //Attributes for Builder Class
        private String teacherEmailAddress;
        private String teacherPassword;
        private String teacherName;

        //Builder Class Constructor
        public Builder() {

        }

        //Builder Returns
        public Builder theirTeacherEmailAddress(String teacherEmailAddress) {
            this.teacherEmailAddress = teacherEmailAddress;
            return this;
        }

        public Builder theirTeacherPassword(String teacherPassword) {
            this.teacherPassword = teacherPassword;
            return this;
        }

        public Builder theirTeacherName(String teacherName) {
            this.teacherName = teacherName;
            return this;
        }


        //Build method
        public Teacher build() {
            Teacher teacher = new Teacher();
            teacher.teacherEmailAddress = this.teacherEmailAddress;
            teacher.teacherPassword = this.teacherPassword;
            teacher.teacherName = this.teacherName;
            return teacher;
        }
    }

    //Getters
    public String getTeacherFullName() {
        return teacherName;
    }

    //toString method
    @Override
    public String toString() {
        return 
        "Teacher: userEmailAddress=" + teacherEmailAddress + 
        ", userPassword=" + teacherPassword +
        ", teacherFullName=" + teacherName;
    }
}
