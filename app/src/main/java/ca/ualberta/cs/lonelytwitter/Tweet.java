package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by yueliang1995 on 14/09/15.
 *
 * we don't want to allow aomeone to go tweet
 * we want to force time
 */
public abstract class Tweet {
    private String text;
    private Date date;


    public Tweet(String tweet, Date date) {
        text = tweet;
        this.date = date;
    }

    public Tweet(String text) {
        this.text = text;
        date = new Date();
    }

    public String getText() {
        return text;
    }

    // x,y in java is basically x->y inC

    public void setText(String text) throws IOException{
        if (text.length() <= 140){
            this.text = text;
        } else {
            throw new IOException("Tweet was too long!");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public abstract Boolean isImportant();
}