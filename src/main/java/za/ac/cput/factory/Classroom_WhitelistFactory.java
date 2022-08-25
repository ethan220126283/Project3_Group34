package za.ac.cput.factory;

import za.ac.cput.domain.Classroom_Whitelist;
import za.ac.cput.util.Helper;

public class Classroom_WhitelistFactory {

    public static Classroom_Whitelist createClassroom_Whitelist(int classroom_id, String whitelist_email) {

        //Validation
        if (Helper.isNullorEmpty(whitelist_email) || Helper.isZero(classroom_id) ){
            throw new IllegalArgumentException("teacher_email and classroom_id mandatory attributes.");
        }

        //Return
        return new Classroom_Whitelist.Builder()
                .theirClassroom_Id(classroom_id)
                .theirWhitelist_Email(whitelist_email)
                .build();
    }
}
