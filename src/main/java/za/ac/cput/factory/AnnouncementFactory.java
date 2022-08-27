package za.ac.cput.factory;

/*
 * Author:  Mogammad Faeedh Daniels
 * Student no:     219174288
 * AnnouncementFactory.java
 */

import za.ac.cput.domain.Announcement;
import za.ac.cput.util.Helper;

public class AnnouncementFactory {

    public static Announcement createAnnouncement(Integer classroom_id, Integer announcement_id, String announcement_date, String announcement_content) {

        if (Helper.isNullorEmpty(announcement_date) || Helper.isNullorEmpty(announcement_content) ){
            throw new IllegalArgumentException("announcement_date and announcement_id mandatory attributes.");
        }

        return new Announcement.Builder()
        .Classroom_Id(classroom_id)
        .Announcement_Id(announcement_id)
        .Announcement_Date(announcement_date)
        .Announcement_Content(announcement_content)
        .build();
    }
}
