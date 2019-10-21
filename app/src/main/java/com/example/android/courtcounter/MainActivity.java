package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Adds three to the given click score for Team A.
     */
    public void addThreePoints (View view){
        scoreTeamA = scoreTeamA +3;
        displayForTeamA( scoreTeamA);
    }

    /**
     * Adds two to the given click score for Team A.
     */
    public void addTwoPoints (View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds one to the given click score for Team A.
     */
    public void addOnePoint (View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * subtract one from the given  score for Team A.
     */
    public void subOnePointFromA (View view){
        scoreTeamA = scoreTeamA -1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * subtract one from the given  score for Team B.
     */
    public void subOnePointFromB (View view){
        scoreTeamB = scoreTeamB -1;
        displayForTeamB(scoreTeamB);
    }



    /**
     * Adds three to the given click score for Team B.
     */
    public void addThreePointsToTeamB (View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB( scoreTeamB);
    }

    /**
     * Adds two to the given click score for Team B.
     */
    public void addTwoPointsToTeamB (View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds one to the given click score for Team B.
     */
    public void addOnePointToTeamB (View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset scores for team A and Team B.
     */
    public void resetScores (View view){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);

        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }





}
