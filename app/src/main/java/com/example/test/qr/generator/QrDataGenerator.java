package com.example.test.qr.generator;

import com.example.test.R;
import com.example.test.qr.QrData;

import java.util.Date;

public class QrDataGenerator {

    public QrData byBusNumberAndPrice(String busNumber, Integer price){
        QrData qrData = new QrData();
        qrData.setBusNumber(busNumber);
        qrData.setDateOfGeneration(new Date());
        qrData.setPrice(price);
        return qrData;
    }

    public QrData byBusNumber(String busNumber){
        return byBusNumberAndPrice(busNumber, R.string.drive_price);
    }

}
