package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by yueliang1995 on 28/09/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest (){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList list = new TweetList();
        list.add(new NormalTweet("test"));
    }

    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.contains(tweet));
    }
    public void testContains(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertFalse(list.contains(tweet));
    }
}