package Exercise1;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class PersistentTime implements Serializable {
    //create date from string
    public Date newDate;

    public void PersTimeParse(){
        Calendar calendar=Calendar.getInstance();
        newDate=this.calendarToDate(calendar);
    }
    public Date calendarToDate(Calendar calendar){
        return calendar.getTime();
    }
}
