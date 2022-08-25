package za.ac.cput.factory;

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
                .theirClassroom_Id(classroom_id)
                .theirAnnouncement_Id(announcement_id)
                .theirAnnouncement_Date(announcement_date)
                .theirAnnouncement_Content(announcement_content)
                .build();
    }
}
