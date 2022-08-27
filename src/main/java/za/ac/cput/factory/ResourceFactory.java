package za.ac.cput.factory;

import za.ac.cput.domain.Resource;
import za.ac.cput.util.Helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ResourceFactory {

    public static Resource createResource(int classroom_id, int resource_id, String resource_type, String resource_link, String resource_description) {

        //Validation
        if (Helper.isZero(classroom_id) || Helper.isZero(resource_id) ){
            throw new IllegalArgumentException("classroom_id and resource_id mandatory attributes.");
        }

        //Calendar object for time log
        Calendar calendar = Calendar.getInstance();

        // Convert Calendar to String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String resource_date = simpleDateFormat.format(calendar.getTime());

        //Return
        return new Resource.Builder()
                .theirClassroom_Id(classroom_id)
                .theirResource_Id(resource_id)
                .theirResource_Date(resource_date)
                .theirResource_Type(resource_type)
                .theirResource_Link(resource_link)
                .theirResource_Description(resource_description)
                .build();
    }
}
