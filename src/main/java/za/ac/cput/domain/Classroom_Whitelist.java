package za.ac.cput.domain;

/*
 * Author:       Ethan Swart
 * Student#:     220126283
 * Last Edited:  2022/08/25
 */

import java.util.Objects;

public class Classroom_Whitelist {

    //Attributes for Classroom_Whitelist
    private int classroom_id;
    private String whitelist_email;

    //Private Constructor
    private Classroom_Whitelist() {}

    public static class Builder{

        //Attributes for Builder class
        private int classroom_id;
        private String whitelist_email;

        //Builder Constructor
        public Builder() {}

        //Builder Returns
        public Builder theirClassroom_Id(int classroom_id) {
            this.classroom_id = classroom_id;
            return this;
        }

        public Builder theirWhitelist_Email(String whitelist_email) {
            this.whitelist_email = whitelist_email;
            return this;
        }

        //Build Method
        public Classroom_Whitelist build() {
            Classroom_Whitelist classroom_whitelist = new Classroom_Whitelist();
            classroom_whitelist.classroom_id = this.classroom_id;
            classroom_whitelist.whitelist_email = this.whitelist_email;
            return classroom_whitelist;
        }

    }

    //toString method
    @Override
    public String toString() {
        return "Classroom_Whitelist{" +
                "classroom_id=" + classroom_id +
                ", whitelist_email='" + whitelist_email + '\'' +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom_Whitelist that = (Classroom_Whitelist) o;
        return classroom_id == that.classroom_id && whitelist_email.equals(that.whitelist_email);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(classroom_id, whitelist_email);
    }

    //Getters
    public int getClassroom_id() {return classroom_id;}

    public String getWhitelist_email() {return whitelist_email;}
}
