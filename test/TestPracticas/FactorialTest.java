/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPracticas;

import Practicas.Factorial;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcos
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculo method, of class Factorial.
     */
    /*@Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = -5;
        int expResult = 0;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    El resultado al introducir un valor menor que 0, es un error que esta introducido
    en el código el cual nos dice que el numero no puede ser menor que 0
    
    
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 10;
        int expResult = 3628800;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    Este test funciona correctamente ya que hemos incluido los valores correctos
    tanto en el numero a probar como en el resultado experado
   */
    
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 20;
        int expResult = 0;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //En este test nos da el error de overflow al ser un número demasiado grande
    //y no poder calcular su factorial  
}
