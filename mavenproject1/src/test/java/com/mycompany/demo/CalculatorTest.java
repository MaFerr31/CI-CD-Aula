/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 823117025
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soma method, of class Calculator.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        double num1 = 0.0;
        double num2 = 0.0;
        double expResult = 0.0;
        double result = Calculator.soma(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtracao method, of class Calculator.
     */
    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        double num1 = 0.0;
        double num2 = 0.0;
        double expResult = 0.0;
        double result = Calculator.subtracao(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacao method, of class Calculator.
     */
    @Test
    public void testMultiplicacao() {
        System.out.println("multiplicacao");
        double num1 = 0.0;
        double num2 = 0.0;
        double expResult = 0.0;
        double result = Calculator.multiplicacao(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divisao method, of class Calculator.
     */
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        double num1 = 0.0;
        double num2 = 0.0;
        double expResult = 0.0;
        double result = Calculator.divisao(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
