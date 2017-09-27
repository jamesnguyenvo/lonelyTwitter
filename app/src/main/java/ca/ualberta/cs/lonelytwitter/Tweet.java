/*
 * CMPUT 301
 * September 26, 2017
 *
 * Copyright 2017 Team X, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at you may find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 *  Represents a tweet
 *
 *  @version 1
 *  @see ca.ualberta.cs.lonelytwitter.NormalTweet
 *  @see ca.ualberta.cs.lonelytwitter.ImportantTweet
 */

/**
 * Created by watts1 on 9/12/17.
 */

public abstract class Tweet {

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     *
     * @param message
     * @param date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Returns Boolean value for if tweet is important
     *
     * @return Bool
     */
    public abstract Boolean isImportant();


    /**
     *  Sets tweet message
     *
     * @param message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     *  Returns message
     *
     * @return message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Returns date
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *  Return string and date
     *
     * @return date and string
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
