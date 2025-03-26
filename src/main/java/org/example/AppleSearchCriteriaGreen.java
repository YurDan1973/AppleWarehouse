package org.example;

class AppleSearchCriteriaGreen implements AppleSearchCriteria {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
