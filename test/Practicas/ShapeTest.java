/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

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
public class ShapeTest {
    
    public ShapeTest() {
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
     * Test of area method, of class Shape.
     */
    /**
    @Test
    public void testArea() {
        System.out.println("Area del cuadrado");
        Shape figura = new Shape(1,6);
        double expResult = 36.0;
        double result = figura.area();
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    En este test se comprueba que podemos calcular el area del cuadrado
    */  
    /**
    @Test
    public void testArea() {
        System.out.println("Area del circulo");
        Shape figura = new Shape(2,6);
        double expResult = 28.274333882308138;
        double result = figura.area();
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del circulo es: "+figura.area());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    //En este test se comprueba que podemos calcular el area del circulo
    */
    @Test
    public void testArea() {
        System.out.println("Area del triangulo");
        Shape figura = new Shape(3,6);
        double expResult = 18;
        double result = figura.area();
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del triangulo es: "+figura.area());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    //En este test se comprueba que podemos calcular el area del triangulo
    }
    
}
