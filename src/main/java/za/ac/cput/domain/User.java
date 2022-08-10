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

    //Private Constructor with no fields, so that only the Builder Class can be used to construct the User Object
    private User() {
        
    }

    public static class Builder {

        //Attributes for builder class
        private String userEmailAddress;
        private String userPassword;

        //Builder class constructor
        public Builder() {

        }

        //Builder returns
        //Email Address
        public Builder theirUserEmailAddress(String userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }

        //Password
        public Builder theirUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        //The build method that returns a user object
        public User build() {
            User user = new User();
            user.userEmailAddress = this.userEmailAddress;
            user.userPassword = this.userPassword;
            return user;
        }
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
