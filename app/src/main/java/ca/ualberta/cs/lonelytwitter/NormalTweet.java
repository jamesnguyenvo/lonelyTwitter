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
 * Created by watts1 on 9/12/17.
 */

/**
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Sets tweet message
     *
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Sets tweet mssage with date
     *
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Return false b/c tweet is not important
     *
     * @return false
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
