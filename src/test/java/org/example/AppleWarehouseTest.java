package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {

   private AppleWarehouse warehouse = new AppleWarehouse();

    @Test
    public void shouldFindGreenApples() {
        List<Apple> greenApples = warehouse.findGreenApples();
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void shouldFindRedApples() {
        List<Apple> redApples = warehouse.findRedApples();
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void shouldFindApplesByColor() {
        List<Apple> greenApples = warehouse.findApplesByColor("green");
        assertEquals(greenApples.size(), 3);
        List<Apple> redApples = warehouse.findApplesByColor("red");
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void shouldFindApplesHeavierThen() {
        List<Apple> applesHeavierThen150 = warehouse.findApplesHeavierThen(150);
        assertEquals(applesHeavierThen150.size(), 4);
    }

    @Test
    public void shouldFindApplesUsingSearchCriteria() {
        List<Apple> greenApples = warehouse.findApples(new AppleSearchCriteriaGreen());
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = warehouse.findApples(new AppleSearchCriteriaRed());
        assertEquals(redApples.size(), 3);

        List<Apple> applesHeavierThen150 = warehouse.findApples(new AppleSearchCriteriaHeavy());
        assertEquals(applesHeavierThen150.size(), 4);

        List<Apple> applesNotHeavierThen150 = warehouse.findApples(new AppleSearchCriteriaLight());
        assertEquals(applesNotHeavierThen150.size(), 4);

    }


}