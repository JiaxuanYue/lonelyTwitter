package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by yueliang1995 on 14/09/15.
 *
 * we don't want to allow aomeone to go tweet
 * we want to force time
 */
public abstract class Current {
    private Date date;


    public Current(Date date) {
        this.date = date;
    }

    public Current() {
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String Mood();
}