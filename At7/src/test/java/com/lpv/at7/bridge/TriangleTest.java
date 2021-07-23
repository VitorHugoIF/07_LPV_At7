/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at7.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class TriangleTest {

     @Test
    public void testDrawTriangleBlue() {
        Shape triangle = new Triangle(new ColorRed());
        assertEquals(triangle.draw(), "Triângulo desenhado com a cor: Cor vermelha");
    }
    
    @Test
    public void testDrawTriangleRed() {
        Shape triangle = new Triangle(new ColorBlue());
        assertEquals(triangle.draw(), "Triângulo desenhado com a cor: Cor azul");
    }
}
