package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jv on 10/10/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // add tweet to a list of tweets
    public void addTweet(Tweet tweet) {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    // delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    // check if a list of tweets has the specified tweet
    // it it does not, return true; otherwise, return false
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {

        ArrayList<Tweet>
        return tweets.get(index);
    }

    public int getCount() {

        return tweets.size();
    }

    public ArrayList<Tweet> getTweets() {
        return this.tweets;
    }

}
