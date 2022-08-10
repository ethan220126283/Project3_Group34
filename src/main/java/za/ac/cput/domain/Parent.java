package za.ac.cput.domain;

/*
* Author:       Ethan Swart
* Student#:     220126283
* Last Edited: 2022/08/10
*/

public class Parent extends User {
    
    /*TODO: Implement JPA in this object.
     * To learn how, watch the June model review on BlackBoard
    */

    //Attributes for Parent class
    private String userEmailAddress;
    private String userPassword;
    private String parentFullName;
    private School parentSchool;

    private Parent() {

    }

    //Builder class
    public static class Builder {

        //Attributes for Builder Class
        private String userEmailAddress;
        private String userPassword;
        private String parentFullName;
        private School parentSchool;

        //Builder Constructor
        public Builder() {

        }

        //Builder Returns
        public Builder theirUserEmailAddress(String userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }

        public Builder thierUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder theirParentFullName(String parentFullName) {
            this.parentFullName = parentFullName;
            return this;
        }

        public Builder theirParentSchool(School parentSchool) {
            this.parentSchool = parentSchool;
            return this;
        }

        //Build method
        public Parent build() {
            Parent parent = new Parent();
            parent.userEmailAddress = this.userEmailAddress;
            parent.userPassword = this.userPassword;
            parent.parentFullName = this.parentFullName;
            parent.parentSchool = this.parentSchool;
            return parent;
        }
    }

    //Getters
    public String getParentFullName() {
        return parentFullName;
    }

    public School getParentSchool() {
        return parentSchool;
    }

    //toString method
    @Override
    public String toString() {
        return 
        "Parent: userEmailAddress=" + userEmailAddress + 
        ", userPassword=" + userPassword +
        ", parentFullName=" + parentFullName +
        ", parentSchool =" + parentSchool.toString();
    }

}
