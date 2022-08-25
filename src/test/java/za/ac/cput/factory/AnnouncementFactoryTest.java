package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Announcement;

import static org.junit.jupiter.api.Assertions.*;

class AnnouncementFactoryTest {

    @Test
    void createAnnouncement() {

        Announcement announcement = AnnouncementFactory.createAnnouncement(
                1,
                1,
                "Hello world!"
        );
        System.out.println(announcement.toString());
        assertNotNull(announcement);
    }
}