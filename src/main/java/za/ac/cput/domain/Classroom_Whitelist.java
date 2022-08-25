package za.ac.cput.domain;

import java.util.Objects;
/*
 * Author:       Darryll merkeur
 * Student#:     220253595
 * Date: 2022/08/25
 */

public class Classroom_Whitelist {
    private int classroom_id;
    private String whitelist_email;

    private Classroom_Whitelist() {}
    public static class Builder{
        private String whitelist_email;
        private int classroom_id;

        public Builder() {

        }
        public Classroom_Whitelist.Builder createrwhitelist_email(String whitelist_email) {
            this.whitelist_email = whitelist_email;
            return this;
        }

        public Classroom_Whitelist.Builder createrclassroom_id(int classroom_id){
            this.classroom_id = classroom_id;
            return this;
        }

        public Classroom_Whitelist build() {
            Classroom_Whitelist classroom_whitelist = new Classroom_Whitelist();
            classroom_whitelist.whitelist_email = this.whitelist_email;
            classroom_whitelist.classroom_id = this.classroom_id;
            return classroom_whitelist;
        }
    }

    @Override
    public String toString() {
        return "Classroom_Whitelist{" +
                "whitelist_email='"
                + whitelist_email + '\'' +
                ", classroom_id=" + classroom_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom_Whitelist objectof =
                (Classroom_Whitelist)
                        o;
        return classroom_id ==
                objectof.classroom_id && Objects.equals
                (whitelist_email, objectof.whitelist_email);
    }

    @Override
    public int hashCode() {
        return Objects.hash
                (whitelist_email,
                        classroom_id);
    }
}
