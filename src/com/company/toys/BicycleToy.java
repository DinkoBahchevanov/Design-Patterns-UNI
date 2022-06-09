package com.company.toys;

public class BicycleToy extends Toy implements Bicycle {

    @Override
    public void rideBicycle() {
        System.out.println("Riding Bicycle yeeeaah!");
    }

    @Override
    public void play() {
        this.rideBicycle();
    }
}
