package com.raghvendra;

import static junit.framework.Assert.*;

public class TeamTest {

    @org.junit.Test
    public void getName() {
        Team<FootballPlayer> crows = new Team<>("Crows");
        String actualTeamName = crows.getName();
        assertEquals("Crows", actualTeamName);
    }

    @org.junit.Test
    public void addPlayer() {
        Team<FootballPlayer> crows = new Team<>("Crows");
        FootballPlayer banks = new FootballPlayer("Gordon");
        boolean isAdded = crows.addPlayer(banks);
        assertEquals(true,isAdded);
    }

    @org.junit.Test
    public void numPlayers() {
        Team<FootballPlayer> crows = new Team<>("Crows");
        FootballPlayer banks = new FootballPlayer("Gordon");
        FootballPlayer taylor = new FootballPlayer("Samy");
        FootballPlayer simons = new FootballPlayer("Dilon");
        crows.addPlayer(banks);
        crows.addPlayer(taylor);
        crows.addPlayer(simons);
        int size = crows.numPlayers();
        assertEquals(3,size);
    }
}
