package com.example.playertracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText playerNameEditText;
    EditText playerPointsEditText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerNameEditText = findViewById(R.id.player_name_edittext);
        playerPointsEditText = findViewById(R.id.player_points_edittext);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == submitButton) {
            String playerName = playerNameEditText.getText().toString();
            int playerPoints = Integer.parseInt(playerPointsEditText.getText().toString());

            Intent intent = new Intent(this, DisplayActivity.class);
            intent.putExtra("playerName", playerName);
            intent.putExtra("playerPoints", playerPoints);
            startActivity(intent);
        }
    }
}
