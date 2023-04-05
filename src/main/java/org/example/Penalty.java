package org.example;

public enum Penalty {
    PENALTY(10);
    final int penaltyValue;

    Penalty(int penaltyValue) {

        this.penaltyValue = penaltyValue;
    }
}
