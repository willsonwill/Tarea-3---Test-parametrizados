/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author WILL
 */
@RunWith(Parameterized.class)
public class CalculadoraTest {
    
    @Parameterized.Parameters
    //devolvera un array de objetos --> coleccion
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, 2}, {3, 15}, {1, 0}, {1, 3}
        });
    }
    private final int v1;
    private final int v2;
    private final Calculadora utils = new Calculadora();

    public CalculadoraTest(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Test
    public void testSuma() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = utils.suma(v1, v2);
        assertEquals(v1 + v2, resultado);
    }
    
    @Test
    public void testResta() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = utils.resta(v1, v2);
        assertEquals(v1 - v2, resultado);
    }
    
    @Test
    public void testMultiplicacion() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = utils.multimplicacion(v1, v2);
        assertEquals(v1 * v2, resultado);
    }
    
    @Test
    public void testDivicion() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        if (v2==0) {
            try {
                utils.division(v1, v2);
                fail();
            } 
            catch (Exception e) {
                final String mensaje = "No se puede dividir entre 0";
                assertEquals( mensaje, e.getMessage());
            }     
        }else{
           int resultado = utils.division(v1, v2);
           assertEquals(v1 / v2, resultado); 
        }
    }
}
