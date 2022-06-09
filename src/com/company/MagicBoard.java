package com.company;

import com.company.toys.Toy;
import com.company.workshops.MainWorkshop;
import com.company.workshops.Workshop;

import java.util.*;

public class MagicBoard {

    private List<Toy> toys = new ArrayList<>();
    private Workshop factory = new MainWorkshop();

    public void write(String toyName) {
        if (toyName.equals("Doll")) {
            toys.add((Toy) factory.createDoll());
        } else if (toyName.equals("Bicycle")) {
            toys.add((Toy) factory.createBicycle());
        }
    }

    public void playWithToys() {
        toys.forEach(Toy::play);
    }
}
