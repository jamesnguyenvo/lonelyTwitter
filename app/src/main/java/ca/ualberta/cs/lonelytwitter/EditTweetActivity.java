package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class EditTweetActivity extends Activity {

    private TextView textViewTweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        String passedArg = getIntent().getStringExtra("tweetToView");

        textViewTweet = (TextView) findViewById(R.id.textView);
        textViewTweet.setText(passedArg);

        Log.d("ERROR", passedArg);
    }



}
