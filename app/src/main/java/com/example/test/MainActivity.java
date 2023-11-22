package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputEditText = findViewById(R.id.numberInput);
    }
    public void onClickCreate(View view){
        Intent intent = new Intent(this, QrGeneratorActivity.class);
        intent.putExtra("bus_number", textInputEditText.getText());
        startActivity(intent);
    }
}