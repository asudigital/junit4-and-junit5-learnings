//package com.lcwd.test.service;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
////    method should be static , class level
//
//    int counter =0;
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test cases:");
//        System.out.println("Started test: " + new Date());
//        // Connection open | file open
//    }
//     @Before
//    public void beforeEach(){
//        System.out.println("Before each test case");
//        counter =0;
//    }
//    @Test(timeout = 2000)
//    public  void addTwoNumbersTest() throws InterruptedException {
//        for(int i=1; i<=20 ; i++){
//           counter += i;
//        }
//        Thread.sleep(3000);
//        System.out.println("test for addTwoNumbersTest");
//        //actual result
//        int result = CalculatorService.addTwoNumbers(12 , 42);
//
//        //expected result
//        int  expected = 54;
//        System.out.println("couner in first test case " + counter);
//        Assert.assertEquals(expected , result );
//    }
//
//    @Test
//    public void sumAnyNumberTest(){
//        System.out.println("counter value is" + counter);
//        for(int i=1; i<=100 ; i++){
//            counter += i;
//        }
//        System.out.println("Test for sum any number tests");
//   int result = CalculatorService.sumAnyNumbers(13 , 12 , 15)  ;
//   int expectedResult = 40;
//   System.out.println("couner in second test case " + counter);
//   Assert.assertEquals(result , expectedResult);
//    }
////    clean up code , method should be static
//    @AfterClass
//    public static void cleanUp(){
//        System.out.println("After all test cases ");
//        System.out.println("End of test cases :" + new Date());
//    }
//
//    //Test
//    //BeforeClass
//    //Before
//    //AfterClass
//    //After
//
//    // THIS IS ALL ABOUT JUNIT 4
//}
