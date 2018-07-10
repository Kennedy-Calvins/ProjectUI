package com.example.kennedycalvins.projectui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Welcome extends AppCompatActivity implements View.OnClickListener{

    private CardView profileCard, teamCard, resultsCard, fixturesCard, playersCard, statsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Setting the view reference to our object OR Defining cards
        profileCard = (CardView) findViewById(R.id.profile);
        teamCard = (CardView) findViewById(R.id.team);
        resultsCard = (CardView) findViewById(R.id.results);
        fixturesCard = (CardView) findViewById(R.id.fixtures);
        playersCard = (CardView) findViewById(R.id.players);
        statsCard = (CardView) findViewById(R.id.stats);


        //Adding click listener to the cards

        profileCard.setOnClickListener(this);
        teamCard.setOnClickListener(this);
        resultsCard.setOnClickListener(this);
        fixturesCard.setOnClickListener(this);
        playersCard.setOnClickListener(this);
        statsCard.setOnClickListener(this);

        //On click method will be called every time we click a card-view

    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.profile : i = new Intent(this,MainActivity.class);startActivity(i); break;
            case R.id.team : i = new Intent(this, Team.class);startActivity(i);break;
            case R.id.results : i = new Intent(this, Results.class);startActivity(i);break;
            case R.id.fixtures : i = new Intent(this, Fixtures.class);startActivity(i);break;
            case R.id.players : i = new Intent(this, Players.class);startActivity(i);break;
            case R.id.stats : i = new Intent(this, Stats.class);startActivity(i);break;
            default:break;

        }

    }
}
