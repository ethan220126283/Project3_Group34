package za.ac.cput.domain;

/*
* Author:       Ethan Swart
* Student#:     220126283
* Last Edited: 2022/08/08
* */

public class School {

    /*TODO: This implementation of complex value object School is without JPA implementation.
    *https://dev.to/peholmst/using-value-objects-with-jpa-27mi
    * Use this link to see how to implement properly.
    * */

    private int schoolID;
    private String schoolName;
    private String schoolAddress;

    //Constructor
    public School(int schoolID, String schoolName, String schoolAddress) {
        this.schoolID = schoolID;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    //Getters
    public int getSchoolID() {
        return schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    //to String method
    @Override
    public String toString() {
        return "School{" +
                "schoolID=" + schoolID +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                '}';
    }
}
