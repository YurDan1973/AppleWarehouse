package org.example;

class AppleSearchCriteriaLight implements AppleSearchCriteria {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= 150;
    }
}
