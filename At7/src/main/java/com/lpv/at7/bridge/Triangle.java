/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at7.bridge;

/**
 *
 * @author vitor.marcelino
 */
public class Triangle extends Shape {

    public Triangle(IColor color) {
        super(color);
    }
    
    @Override
    public String draw() {
        return "Triângulo desenhado com a cor: " + color.fill();
    }
}
