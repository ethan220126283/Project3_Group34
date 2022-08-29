package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Classroom_Whitelist;
import static org.junit.jupiter.api.Assertions.*;
class Classroom_WhitelistFactoryTest {
    /*
     * Author:       Darryll merkeur
     * Student#:     220253595
     * Date: 2022/08/25
     */
    @Test
    void createClassroom_Whitelist() {
        Classroom_Whitelist classroom_whitelist
                = Classroom_WhitelistFactory
                .
                createClassroom_Whitelist("www.CPUT123@gmail.com", 2);
        System.out.println
                (classroom_whitelist.toString());
        assertNotNull
                (classroom_whitelist);
    }
}