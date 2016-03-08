/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalinear;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Eric Farias
 * @since 08/03/2016 
 */
public class BuscaLinearTest {
    @Test
    public void testaAtributoValorNull(){
        Integer[] h = {23, 12, 45, 30, 21, 78, 90, 12, 39};
        Integer valor = null;
        
        // resultado esperado -1
        int result = BuscaLinear.buscar(valor, h);
        assertEquals(-1, result);        
    }
    
    @Test
    public void testaSeABuscaTrazOValorCorreto(){
        Integer[] h = {23, 12, 45, 30, 21, 78, 90, 12, 39};
    
        Integer valor = 30;
        
        // resultado esperado -1
        int result = BuscaLinear.buscar(valor, h);
        assertEquals(3, result);   
    }
}
