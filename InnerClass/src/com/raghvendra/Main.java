package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        Gearbox gbox = new Gearbox(6);
        gbox.addGear(1,5.3);
        gbox.addGear(2,10.6);
        gbox.addGear(3,15.9);
        gbox.operateClutch(true);
        gbox.changeGear(1);
        gbox.operateClutch(false);
        System.out.println("Wheel Speed: "+ gbox.wheelSpeed(1000));
        gbox.changeGear(2);
        System.out.println("Wheel Speed: "+ gbox.wheelSpeed(3000));
        gbox.operateClutch(true);
        gbox.changeGear(3);
        gbox.operateClutch(false);
        System.out.println("Wheel Speed: "+ gbox.wheelSpeed(6000));

        //Below implementation is when Gear class is public
//        Gearbox.Gear first = gbox.new Gear(1,12.3);
//        Gearbox.Gear second = new Gearbox().Gear(2,14.5); -- wrong way
//        Gearbox.Gear third = new gbox.Gear(3.12.3);  -- wrong way
//        System.out.println(first.driveSpeed(1000));
    }
}
