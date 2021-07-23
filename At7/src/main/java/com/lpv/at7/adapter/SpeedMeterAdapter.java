/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at7.adapter;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author vitor.marcelino
 */
public class SpeedMeterAdapter extends SpeedMeterKilometer {
   
    private ISpeedMeter speedMiles;

    public SpeedMeterAdapter(ISpeedMeter speedMiles) {
        this.speedMiles = speedMiles;
    }
    
    public double getSpeedAdapter() {
        double km = this.getSpeedKm();
        String convert = round(km*0.62137);  
        double value = Double.parseDouble( convert.replace(",",".") );
        speedMiles.setSpeed(value);
        
        return speedMiles.getSpeed(); 
    }

    public void setSpeedAdapter() {
        
        double miles = speedMiles.getSpeed();
        String convert = round(miles/0.62137);      
        double value = Double.parseDouble( convert.replace(",",".") );   
        
        this.setSpeedKm(value);
    }
    
    private static String round(double average) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(average);
    }
}
