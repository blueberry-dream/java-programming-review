// test file GreetingService

package com.packtpub.ge.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GreetingServiceTest {
    GreetingService service;

    @Before
    public void setup() {
        service = new GreetingService();
    }

    @Test
    public void testGreet() {
        assertEquals("Hello Test", service.Greet("Test"));
    }

    @Test
    public void testGreet2() {
        assertEquals("Hello Guest", service.Greet("Guest"));
    }
}
