package org.example;

class AppleSearchCriteriaHeavyAndGreen implements AppleSearchCriteria {

    private AppleSearchCriteriaHeavy heavyApples = new AppleSearchCriteriaHeavy();
    private AppleSearchCriteriaGreen greenApples = new AppleSearchCriteriaGreen();

    @Override
    public boolean test(Apple apple) {
        return heavyApples.test(apple) && greenApples.test(apple);
    }
}
