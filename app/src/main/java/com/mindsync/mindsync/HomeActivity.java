package com.mindsync.mindsync;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

    Button chatButton, profileButton, relaxationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find buttons
        chatButton = findViewById(R.id.chatButton);
        profileButton = findViewById(R.id.profileButton);
        relaxationButton = findViewById(R.id.relaxationButton);

        // OnClickListeners for buttons
        chatButton.setOnClickListener(v -> {
            // Start ChatActivity
            Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
            startActivity(intent);
        });

        profileButton.setOnClickListener(v -> {
            // Start ProfileActivity (to be created later)
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        relaxationButton.setOnClickListener(v -> {
            // Start RelaxationActivity (to be created later)
            Intent intent = new Intent(HomeActivity.this, RelaxationActivity.class);
            startActivity(intent);
        });
    }
}
