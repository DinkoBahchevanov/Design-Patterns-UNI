package com.company.workshops;

import com.company.toys.Bicycle;
import com.company.toys.BicycleToy;
import com.company.toys.Doll;
import com.company.toys.DollToy;

public class MainWorkshop implements Workshop{

    @Override
    public Doll createDoll() {
        return new DollToy();
    }

    @Override
    public Bicycle createBicycle() {
        return new BicycleToy();
    }
}
