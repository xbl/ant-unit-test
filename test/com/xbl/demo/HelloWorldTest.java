package com.xbl.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void given_a_is_1_and_b_is_2_when_called_add_when_return_3() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(3, helloWorld.add(1,2));
    }
}
