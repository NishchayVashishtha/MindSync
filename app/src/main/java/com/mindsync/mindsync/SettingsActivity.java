package com.mindsync.mindsync;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

public class SettingsActivity extends Activity {

    Switch darkModeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        darkModeSwitch = findViewById(R.id.darkModeSwitch);

        darkModeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Dark Mode Enabled (functionality pending)", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Dark Mode Disabled", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
