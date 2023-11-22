package com.example.test.qr;

import java.util.Date;

public class QrData {
    private String busNumber;
    private Date dateOfGeneration;
    private Integer price;
    private String qrCode;

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void setDateOfGeneration(Date dateOfGeneration) {
        this.dateOfGeneration = dateOfGeneration;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Date getDateOfGeneration() {
        return dateOfGeneration;
    }

    public Integer getPrice() {
        return price;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getQrCode() {
        return qrCode;
    }
}
