package za.ac.cput.domain;

/*
 * Author:  Mogammad Faeedh Daniels
 * Student no:     219174288
 * Announcement.java
 */

import java.util.Objects;

public class Announcement {

    private int classroom_id;
    private int announcement_id;
    private String announcement_date;
    private String announcement_content;

    //Private constructor
    private Announcement() {}

    public static class Builder{

        //Attributes for Builder
        private int classroom_id;
        private int announcement_id;
        private String announcement_date;
        private String announcement_content;

        public Builder() {}

        public Announcement.Builder Classroom_Id(int classroom_id){
            this.classroom_id = classroom_id;
            return this;
        }

        public Announcement.Builder Announcement_Id(int announcement_id){
            this.announcement_id = announcement_id;
            return this;
        }

        public Announcement.Builder Announcement_Date(String announcement_date){
            this.announcement_date = announcement_date;
            return this;
        }

        public Announcement.Builder Announcement_Content(String announcement_content){
            this.announcement_content = announcement_content;
            return this;
        }

        //Build method
        public Announcement build() {
            Announcement announcement = new Announcement();
            announcement.classroom_id = this.classroom_id;
            announcement.announcement_id = this.announcement_id;
            announcement.announcement_date = this.announcement_date;
            announcement.announcement_content = this.announcement_content;
            announcement.announcement_content = announcement_content;
            return announcement;
        }
    }


    //Getters
    public int getClassroom_id() {return classroom_id;}

    public int getAnnouncement_id() {return announcement_id;}

    public String getAnnouncement_date() {return announcement_date;}

    public String getAnnouncement_content() {return announcement_content;}

    //toString method
    @Override
    public String toString() {
        return "Announcement{" +
                "classroom_id=" + classroom_id +
                ", announcement_id=" + announcement_id +
                ", announcement_date=" + announcement_date +
                ", announcement_content='" + announcement_content + '\'' +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Announcement that = (Announcement) o;
        return classroom_id == that.classroom_id && announcement_id == that.announcement_id && Objects.equals(announcement_date, that.announcement_date) && Objects.equals(announcement_content, that.announcement_content);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(classroom_id, announcement_id, announcement_date, announcement_content);
    }
}
