package za.ac.cput.factory;


/*
 * Author:  Mogammad Faeedh Daniels
 * Student no:     219174288
 * AnnouncementFactoryTest.java
 */


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Announcement;

import static org.junit.jupiter.api.Assertions.*;


public class AnnouncementFactoryTest {

    @Test
    void createAnnouncement() {
        Announcement announcement = AnnouncementFactory.createAnnouncement(
                6,
                1,
                "17 August 2022"
        );
        System.out.println(announcement.toString());
        assertNotNull(announcement);
    }
}
