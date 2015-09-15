package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yueliang1995 on 14/09/15.
 */
public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public NormalTweet(String text) {
        super(text);
    }
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
