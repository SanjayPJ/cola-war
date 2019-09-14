package com.example.colawar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int udacicola_votes = 0;
    int pepsicola_votes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment_udacicola_votes(View view){
        udacicola_votes++;
    }

    public void increment_pepsicola_votes(View view){
        pepsicola_votes++;
    }

    public void show_votes(View view){
        TextView showVotesTextView = (TextView) findViewById(R.id.votes_text_view);
        showVotesTextView.setText("Udacicola: " + Integer.toString(udacicola_votes) + "\nPepsicola: " + Integer.toString(pepsicola_votes));
    }
}
