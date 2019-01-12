package com.dias.daniel.mycollectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(new Intent(MainActivity.this, SearchGameActivity.class));
            }
        });


        Button addGameButton = findViewById(R.id.add_game_button);
        addGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(new Intent(MainActivity.this, AddGameActivity.class));
            }
        });

        Button addPlatformButton = findViewById(R.id.add_platform_button);
        addPlatformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(new Intent(MainActivity.this, AddPlatformActivity.class));
            }
        });


    }


}
