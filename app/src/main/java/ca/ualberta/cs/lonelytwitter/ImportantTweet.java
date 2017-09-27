/*
 * CMPUT 301
 * September 26, 2017
 *
 * Copyright 2017 Team X, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at you may find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

/**
 * @author jv
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 *
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */



public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Set message
     *
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     *  Set message and date
     *
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Return true because it is important tweet
     *
     * @return True
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
