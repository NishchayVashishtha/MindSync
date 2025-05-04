package com.mindsync.mindsync;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RelaxationActivity extends Activity {

    TextView relaxationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxation);

        // Find the TextView to display relaxation techniques
        relaxationTextView = findViewById(R.id.relaxationTextView);

        // Dummy relaxation content (replace with actual relaxation techniques later)
        relaxationTextView.setText("Welcome to Relaxation Activity! This will be the relaxation techniques.");
    }
}
