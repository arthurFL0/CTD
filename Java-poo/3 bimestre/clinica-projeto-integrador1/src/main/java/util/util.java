package util;

import java.sql.Timestamp;
import java.util.Date;

public class util {

    public static Timestamp dateToTimestamp (Date d){
        Timestamp timestamp = new Timestamp(d.getTime());
        return timestamp;
    }

}
