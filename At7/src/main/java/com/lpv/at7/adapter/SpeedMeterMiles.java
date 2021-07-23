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
public class SpeedMeterMiles implements ISpeedMeter{
    
    private double miles;
    
    @Override
    public double getSpeed() {
        return this.miles;
    }

    @Override
    public void setSpeed(double miles) {
        this.miles = miles;
    }
}
