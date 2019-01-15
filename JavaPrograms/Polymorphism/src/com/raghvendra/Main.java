package com.raghvendra;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alien attempts to take over planet Earth.";
    }
}

class Mazerunner extends Movie {
    public Mazerunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids tries to escape a Maze.";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces tries to take over Universe.";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i < 11; i++) {
            Movie movie =  randomMovie();
            System.out.println("Movie # " + i +
                                ": " + movie.getName() + '\n' +
                                "plot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomnumber = (int) (Math.random()*5) +1;
        System.out.println("Random number " + randomnumber);
        switch (randomnumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Mazerunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
