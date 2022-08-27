package za.ac.cput.factory;

/*
 * Author:  Mogammad Faeedh Daniels
 * Student no:     219174288
 * AnnouncementFactory.java
 */

import za.ac.cput.domain.Announcement;
import za.ac.cput.util.Helper;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AnnouncementFactory {

    public static Announcement createAnnouncement(int classroom_id, int announcement_id, String announcement_content) {

        //Validation
        if (Helper.isZero(classroom_id) || Helper.isZero(announcement_id) ){
            throw new IllegalArgumentException("classroom_id and announcement_id mandatory attributes.");
        }

        //Calendar object for time log
        Calendar calendar = Calendar.getInstance();

        // Convert Calendar to String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String announcement_date = simpleDateFormat.format(calendar.getTime());

        //Return
        return new Announcement.Builder()
                .Classroom_Id(classroom_id)
                .Announcement_Id(announcement_id)
                .Announcement_Date(announcement_date)
                .Announcement_Content(announcement_content)
                .build();
    }
}
