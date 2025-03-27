package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleSearchCriteriaGreenTest {
    private AppleSearchCriteriaGreen criteria = new AppleSearchCriteriaGreen();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("green", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("yellow", 200);
        assertFalse(criteria.test(apple));
    }
}
