package za.ac.cput.domain;

/*
 * Author:  Mogammad Faeedh Daniels
 * Student no:     219174288
 * Announcement.java
 */

public class Announcement {

    private int classroom_id;
    private int announcement_id;
    private String announcement_date;
    private String announcement_content;

    private Announcement() {}

    public static class Builder{

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

        public Announcement build() {
            Announcement announcement = new Announcement();
            announcement.classroom_id = this.classroom_id;
            announcement.announcement_id = this.announcement_id;
            announcement.announcement_date = this.announcement_date;
            announcement.announcement_content = this.announcement_content;
            return announcement;
        }
    }

    @Override
    public String toString() {
        return "classroom_id = " + classroom_id + "announcement_id = " +
                announcement_id + "announcement_date = " + announcement_date + "announcement_content = " + announcement_content;
    }
}
