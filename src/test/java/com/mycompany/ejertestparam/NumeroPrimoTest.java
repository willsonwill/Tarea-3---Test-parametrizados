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
public class NumeroPrimoTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            { 2, true },{ 6, false },{ 19, true },{ 22, false },{ 23, true }
        });
    }
    //@Parameterized.Parameter(0)
    //public int valor1;
    private final Integer v1;
    private Boolean resultado;
    NumeroPrimo utils = new NumeroPrimo();
    public NumeroPrimoTest(Integer v1,Boolean resultado) {
        this.v1 = v1;
        this.resultado = resultado;
    }
    
   

    @Test
    public void testNumeroPrimo() {
        System.out.println(v1);
        //assertTrue(utils.validate(v1));
        assertEquals(resultado, utils.validate(v1));
    }
    
}
