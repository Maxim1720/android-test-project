package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    private String username;
    private TextView greetingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        username = getIntent().getExtras().get("username").toString();
        greetingTextView = findViewById(R.id.greeting_text_view);
        String newText = greetingTextView.getText() + " " + username;
        greetingTextView.setText(newText);
    }

    public void onBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}