/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
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
public class FibonacciTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1}, {3}, {5}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    Fibonacci utils = new Fibonacci();

    @Test
    public void testFibonacci() {
        String resultado;
        String esperado1="0,1,1";
        String esperado2="0,1,1,2,3";
        String esperado3="0,1,1,2,3,5";
        resultado=utils.bibonacci(valor1);
        if (valor1==1) {
            assertEquals(esperado1, resultado);
        }
        if (valor1==3) {
             assertEquals(esperado2, resultado);
        }
        if (valor1==5) {
             assertEquals(esperado3, resultado);
        }
        
    }
    
}
