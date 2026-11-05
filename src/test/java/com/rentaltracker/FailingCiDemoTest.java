package com.rentaltracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FailingCiDemoTest {

    @Test
    void testCiPipelineDetectsFailingTest() {
        assertEquals(2, 1, "Intentional failure to demonstrate CI pipeline");
    }
}
