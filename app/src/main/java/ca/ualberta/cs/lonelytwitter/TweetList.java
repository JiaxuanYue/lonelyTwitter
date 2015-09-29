package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by yueliang1995 on 28/09/15.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }
    public void addTweet(Tweet tweet){
        int i = tweets.size();
        for (int x=0; x<i; x++){
            if(tweets.get(x) == tweet){
                throw new IllegalArgumentException();
            }
        }

    }
    private ca.ualberta.cs.lonelytwitter.Tweet getTweets(){
        int i = tweets.size();
        for (int x=0; x<i; x++){
            return tweets.get(x);
        }
        return null;
    }

    public Boolean hasTweet(Tweet tweet){
        int i = tweets.size();
        for (int x=0; x<i; x++){
            if(tweets.get(x) == tweet){
                return tweets.contains(tweet);
            }
        }

        return null;
    }

    public void removeTweet(Tweet tweet){
        delete(tweet);
    }

    public int getCount(Tweet tweet){
        int i = tweets.size();
        int count=0;
        for (int x=0; x<i; x++){
            count++;
        }
        return count;
    }

    public void delete(Tweet tweet){

    }
    public Boolean contains(Tweet tweet){
        return tweets.contains(tweet);
    }
}
