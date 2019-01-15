package com.raghvendra;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car--> startEngine()";
    }

    public void Accelerate() {
        System.out.println("Car--> Accelerate()");
    }

    public String brake() {
        return "Car--> Brake()";
    }
    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
}

class Porsche extends Car {
    public Porsche() {
        super(4,"porsche");
    }

    @Override
    public String startEngine() {
//        return "Porsche--> startEngine()";
        return getClass().getSimpleName() + "--> startEngine()"; // using the getClass() built-in function to get the class name
    }

    @Override
    public void Accelerate() {
//        System.out.println("Porsche--> Accelerate()");
        System.out.println(getClass().getSimpleName() + "--> Accelerate()");
    }

    @Override
    public String brake() {
//        return "Porsche--> brake()";
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Outlander extends Car {
    public Outlander() {
        super(3,"Outlander");
    }

    @Override
    public String startEngine() {
        return "Outlander--> startEngine()";
    }

    @Override
    public void Accelerate() {
        System.out.println("Outlander--> Accelerate()");;
    }

    @Override
    public String brake() {
        return "Outlander--> brake()";
    }
}

class Mustang extends Car {
    public Mustang() {
        super(5,"Mustang");
    }

    @Override
    public String startEngine() {
        return "Mustang--> startEngine()";
    }

    @Override
    public void Accelerate() {
        System.out.println("Mustang--> Accelerate()");;
    }

    @Override
    public String brake() {
        return "Mustang--> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(6,"Generic Car");
        System.out.println(car.startEngine());
        car.Accelerate();
        System.out.println(car.brake());

        Porsche porsche  = new Porsche();
        System.out.println(porsche.startEngine());
        porsche.Accelerate();
        System.out.println(porsche.brake());
    }
}
