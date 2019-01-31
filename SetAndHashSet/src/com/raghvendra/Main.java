package com.raghvendra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); //temp is Earth

        temp =  new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); // temp is Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); //temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); //temp is Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); //temp is Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); //temp is Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); //temp is Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);


        System.out.println("==========================");
        System.out.println("Planets \tOrbital Speed");
        System.out.println("==========================");
        for(HeavenlyBody planet : planets){
            System.out.println(planet.getName()+"\t\t"+ planet.getOrbitalPeriod());
        }

        System.out.println("==========================");
        HeavenlyBody body = solarSystem.get("lksd");
        if(body != null){
            System.out.println("Moons of Planet " + body.getName());
            System.out.println("==========================");
            for (HeavenlyBody moons : body.getSatellites()) {
                System.out.println(moons.getName()+"\t\t"+moons.getOrbitalPeriod());
            }
        } else {
            System.out.println("Please try valid planet from the above list");
        }

        // We can use union property of sets to get all the moons from the planets
        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        //print all the moons
        System.out.println("==========================");
        System.out.println("All the moons");
        System.out.println("==========================");
        for(HeavenlyBody moon: moons){
            System.out.println(moon.getName()+"\t\t"+ moon.getOrbitalPeriod());
        }
    }
}
