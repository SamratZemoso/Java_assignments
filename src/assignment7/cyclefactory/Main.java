package assignment7.cyclefactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instance of all Factories
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();

        ArrayList<Cycle> cycles = new ArrayList<>();
        // creating objects for all types of cycles
        cycles.add(unicycleFactory.createCycle());
        cycles.add(bicycleFactory.createCycle());
        cycles.add(tricycleFactory.createCycle());

        // calling ride method for all Cycle objects
        for(Cycle cycle: cycles) {
            cycle.ride();
        }

    }
}
