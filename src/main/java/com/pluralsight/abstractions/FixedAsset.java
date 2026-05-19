package com.pluralsight.abstractions;

import com.pluralsight.interfaces.Valuable;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }


    @Override
    public double getValue() {
        return marketValue;
    }
}
