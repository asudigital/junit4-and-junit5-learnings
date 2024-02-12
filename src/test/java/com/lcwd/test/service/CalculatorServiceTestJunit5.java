package com.lcwd.test.service;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {

    // execute logic before all test cases
    @BeforeAll
    public static  void init(){
        System.out.println("This is single time logic");
    }
    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("This will execute before each test case");
    }
    @AfterEach
    public void  afterEachTestCase(){
        System.out.println("This will execute after each test case");
    }
    @Test
    @DisplayName("This is custom name")
    @Tag("")                             // it is used for tagging
    public void addTwoNumbersTest(){
        System.out.println("First Test case");
      int actualResult = CalculatorService.addTwoNumbers(12 , 13) ;
      int expectedResult = 25;
        Assertions.assertEquals( expectedResult , actualResult , "Test Failed");
    }
    @Test
    @Disabled
    public void addAnyNumberTest(){
        System.out.println("Second Test case");
      int result= CalculatorService.sumAnyNumbers(12 ,13 , 15 , 17);
      int expectedResult = 57;
      Assertions.assertEquals(result ,  expectedResult);
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("This will execute after all test cases");
    }

//   @Nested           --------------      it is used for one class inside another class
//    @TestFactory          ----------------  this method used for marking a method
}
