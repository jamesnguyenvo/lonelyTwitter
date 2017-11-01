package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

// made private to weaken the access of the method, not necessary
interface Tweetable {
    // removed public modifier because this is an interface and including that modifier is redundant
    String getMessage();
    // removed public modifier because this is an interface and including that modifier is redundant
    Date getDate();

}
