package com.example.playertracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView playerNameTextView;
    TextView playerPointsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        playerNameTextView = findViewById(R.id.player_name_textview);
        playerPointsTextView = findViewById(R.id.player_points_textview);

        Intent intent = getIntent();
        String playerName = intent.getStringExtra("playerName");
        int playerPoints = intent.getIntExtra("playerPoints", 0);

        playerNameTextView.setText(playerName);
        playerPointsTextView.setText(String.valueOf(playerPoints));
    }
}

