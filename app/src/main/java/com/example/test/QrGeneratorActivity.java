package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test.qr.QrData;
import com.example.test.qr.generator.QrDataGenerator;

public class QrGeneratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String busNumber = getIntent().getExtras().getString("bus_number");
        QrData qr = new QrDataGenerator().byBusNumber(busNumber);
        setContentView(R.layout.activity_qr_generator);
    }
}