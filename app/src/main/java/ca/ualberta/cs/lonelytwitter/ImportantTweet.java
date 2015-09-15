package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by yueliang1995 on 14/09/15.
 */
public class ImportantTweet extends Tweet implements Tweetable{
    public ImportantTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public ImportantTweet(String text) throws IOException{
        super(text);
        this.setText(text);

    }
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
