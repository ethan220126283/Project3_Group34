package za.ac.cput.factory;

import za.ac.cput.domain.Classroom_Whitelist;
import za.ac.cput.util.Helper;
/*
 * Author:       Darryll merkeur
 * Student#:     220253595
 * Date: 2022/08/25
 */
public class Classroom_WhitelistFactory {
    public static Classroom_Whitelist createClassroom_Whitelist(String whitelist_email, int classroom_id)
    {
        if (Helper.isNullorEmpty(whitelist_email) || Helper.isZero(classroom_id) )
        {
            throw new IllegalArgumentException("Classroom_whitelist should take email and id compulsory");
        }

        return new Classroom_Whitelist.Builder()
                .createrwhitelist_email(whitelist_email)
                .createrclassroom_id(classroom_id)
                .build();
    }
}
