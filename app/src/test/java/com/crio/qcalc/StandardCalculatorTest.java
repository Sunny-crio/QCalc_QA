package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }
    


    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(1000, 2);
                double actualResult = standardCalculator.getResult();
                Assertions.assertEquals(3, actualResult);
            }
        });
    }
    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.subtract(1,4);
                double actualResult = standardCalculator.getResult();
                Assertions.assertEquals(-3, actualResult);
            }
        });
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }


    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,0);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1.43,3);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-1.57, actualResult);
    }
    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationionOperation(){
        standardCalculator.multiply(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(1, actualResult);
    }
    @Test
    @DisplayName("Test division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(0,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }
       
    }


