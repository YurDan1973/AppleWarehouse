package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleSearchCriteriaRedTest {

        private AppleSearchCriteriaRed criteria = new AppleSearchCriteriaRed();

        @Test
        public void shouldSucceed() {
            Apple apple = new Apple("red", 200);
            assertTrue(criteria.test(apple));
        }

        @Test
        public void shouldFail() {
            Apple apple = new Apple("yellow", 200);
            assertFalse(criteria.test(apple));
        }
}
