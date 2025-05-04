package com.mindsync.mindsync;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends Activity {

    TextView profileTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Find the TextView to display the profile details
        profileTextView = findViewById(R.id.profileTextView);

        // Dummy profile content (replace with actual profile functionality later)
        profileTextView.setText("Welcome to Profile Activity! This will be the profile details.");
    }
}
