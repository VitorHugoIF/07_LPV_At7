/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at7.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class CarTest {
    
    @Test
    public void testGetSpeedKilometer() {
        Car car = new Car();
        car.setSpeedAdapter(10.00);

        assertEquals(10.00, car.getSpeedAdapter());
    }

    @Test
    public void testGetSpeedMiles() {
        Car car = new Car();
        car.setSpeedAdapter(10.00);

        assertEquals(16.09, car.getSpeedKm());
    }
}
