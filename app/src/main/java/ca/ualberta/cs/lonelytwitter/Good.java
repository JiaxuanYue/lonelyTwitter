package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yueliang1995 on 14/09/15.
 */
public class Good extends Current{
    public Good(Date date) {
        super(date);
    }

    public Good() {
        super();
    }
    public String Mood(){
        return "Good";
    }
}
