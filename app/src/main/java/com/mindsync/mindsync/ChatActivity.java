package com.mindsync.mindsync;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ChatActivity extends Activity {

    TextView chatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // Find the TextView where chat history will be displayed
        chatTextView = findViewById(R.id.chatTextView);

        // Dummy chat content (replace with actual chat functionality later)
        chatTextView.setText("Welcome to Chat Activity! This will be the chat history.");
    }
}
