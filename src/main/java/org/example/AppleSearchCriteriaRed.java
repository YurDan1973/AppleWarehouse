package org.example;

class AppleSearchCriteriaRed implements AppleSearchCriteria {

    @Override
    public boolean test(Apple apple) {

        return apple.getColor().equals("red");
    }
}
