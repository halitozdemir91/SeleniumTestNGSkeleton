package tr.com.test.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static String getCurrentTimeOfSystem() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        Date date = new Date();
        String CurrentTime = dateFormat.format(date);
        return CurrentTime;
    }


}
