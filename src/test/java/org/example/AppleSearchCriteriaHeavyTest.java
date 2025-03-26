package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleSearchCriteriaHeavyTest {

    private AppleSearchCriteriaHeavy criteria = new AppleSearchCriteriaHeavy();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("yellow", 200);
        assertTrue(criteria.test(apple)); ;
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("yellow", 100);
        assertFalse(criteria.test(apple)); ;
    }
}
