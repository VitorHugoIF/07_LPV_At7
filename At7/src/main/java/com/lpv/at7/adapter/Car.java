/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at7.adapter;

/**
 *
 * @author vitor.marcelino
 */
public class Car {
    ISpeedMeter speedMeter;
    SpeedMeterAdapter adapter;

    public Car() {
        speedMeter = new SpeedMeterMiles();
        adapter = new SpeedMeterAdapter(speedMeter);
    }

    public void setSpeedAdapter(double miles) {
        speedMeter.setSpeed(miles);
        adapter.setSpeedAdapter();
    }

    public double getSpeedAdapter() {
        return adapter.getSpeedAdapter();
    }
    
    // Método apenas para mostrar que está convertendo Milhas para Quilômetros através do adaptador
    public double getSpeedKm() {
        return adapter.getSpeedKm();
    }
}
