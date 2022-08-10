package za.ac.cput.domain;

/*
* Author:       Ethan Swart
* Student#:     220126283
* Last Edited: 2022/08/10
* */

public class User {
    
    /*TODO: Implement JPA in this object.
     * To learn how, watch the June model review on BlackBoard
    */
    private String userEmailAddress;
    private String userPassword;

    //User constructor
    public User() {
        
    }


    //Getters
    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public String getUserPassword() {
        return userPassword;
    }

    //toString method
    @Override
    public String toString() {
        return "User: userEmailAddress=" + userEmailAddress + ", userPassword=" + userPassword;
    }


}
