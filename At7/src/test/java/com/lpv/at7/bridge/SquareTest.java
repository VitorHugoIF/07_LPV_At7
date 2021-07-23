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
public class SquareTest {
    
    @Test
    public void testDrawSquareBlue() {
        Shape square = new Square(new ColorRed());
        assertEquals(square.draw(), "Quadrado desenhado com a cor: Cor vermelha");
    }
    
    @Test
    public void testDrawSquareRed() {
        Shape square = new Square(new ColorBlue());
        assertEquals(square.draw(), "Quadrado desenhado com a cor: Cor azul");
    }
}
