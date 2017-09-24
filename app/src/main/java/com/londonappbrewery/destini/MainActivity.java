package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    private int mStoryIndexTop;
    private int mStoryIndexBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: make mStoryIndex equal to 1 to start
         mStoryIndexTop = 0;
         mStoryIndexBottom = 0;


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndexTop = mStoryIndexTop + 1;
            if ((mStoryIndexTop == 1 && mStoryIndexBottom == 0) || (mStoryIndexTop == 1 && mStoryIndexBottom == 1)) {
                storyTextView.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
            }
            else
            {
                storyTextView.setText(R.string.T6_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndexBottom = mStoryIndexBottom + 1;

            if(mStoryIndexBottom == 1 && mStoryIndexTop == 0) {
                storyTextView.setText(R.string.T2_Story);
                buttonTop.setText(R.string.T2_Ans1);
                buttonBottom.setText(R.string.T2_Ans2);
            }
            else if(mStoryIndexBottom == 2 && mStoryIndexTop == 0)
            {
                storyTextView.setText(R.string.T4_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            }
            else
            {
                storyTextView.setText(R.string.T5_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            }
            }
        });


    }
}
