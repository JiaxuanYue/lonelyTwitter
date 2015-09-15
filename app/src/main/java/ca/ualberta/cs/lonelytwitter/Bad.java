package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yueliang1995 on 14/09/15.
 */
public class Bad extends Current{
    public Bad(Date date) {
        super(date);
    }

    public Bad() {
        super();
    }

    public String Mood(){
        return "Bad";
    }
}
