package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Classroom_Whitelist;

import static org.junit.jupiter.api.Assertions.*;

class Classroom_WhitelistFactoryTest {

    @Test
    void createClassroom_Whitelist() {
        Classroom_Whitelist classroom_whitelist = Classroom_WhitelistFactory.createClassroom_Whitelist(
                1,
                "james@mail.com"
        );
        System.out.println(classroom_whitelist.toString());
        assertNotNull(classroom_whitelist);
    }
}