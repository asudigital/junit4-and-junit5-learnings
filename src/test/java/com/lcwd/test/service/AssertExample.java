package com.lcwd.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssertExample {

//    Assertions - validating Actual result with Expected Result
    //Assertion class

    @Test
    public void Test1(){
        System.out.println("Testing some assertion methods");
//        float actual =  12;
//        Float expected = 12.0f;
        //overloaded method
//        Assertions.assertEquals(actual , expected);
//        int actualArr[] = {1,2,3,4};
//        int expectedArr[] = {1,2,3,4};
//        Assertions.assertArrayEquals(actualArr , expectedArr);

//        String name = new String("Asu");
//        String expectedName = new String("Asu");
////        Assertions.assertSame(expectedName , name);
//        Assertions.assertEquals(name , expectedName);
        String name = " ";
        String name2 = null;
        String expectedName = "Asu";
//        Assertions.assertEquals(expectedName , name);
//        Assertions.assertSame(expectedName , name);

//        Assertions.assertNotNull(name, "Object should not be null");
//        Assertions.assertNull(name2);

//        boolean value = true;
//        Assertions.assertTrue(value);
//           Assertions.assertFalse();

        // order matters here
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
//        Assertions.assertIterableEquals(list2 , list1);

        Assertions.assertThrows(RuntimeException.class , () -> {
//            System.out.println("it should fail");
        throw new RuntimeException("This is a Testing Exceptions");
        });

    }
}
