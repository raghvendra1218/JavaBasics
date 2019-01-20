package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer banks = new FootballPlayer("Gordon");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> sharks = new Team<>("Sharks");

        sharks.addPlayer(joe);
//        sharks.addPlayer(pat);
//        sharks.addPlayer(beckham);

        System.out.println(sharks.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Spartans");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<>("Europia");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> loren = new Team<>("Loren");

        melbourne.matchResult(sharks, 9,0);
        melbourne.matchResult(sharks, 9,0);
        melbourne.matchResult(loren,3,8);

        sharks.matchResult(loren,9,1);
//        sharks.matchResult(baseballTeam,4,4);
        System.out.println("**************");
        System.out.println("Rankings");
        System.out.println("**************");
        System.out.println( sharks.getName() +" : " +sharks.ranking());
        System.out.println(loren.getName() +" : " +loren.ranking());
        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
        System.out.println("Ranking of sharks to melbourne = "+sharks.compareTo(melbourne));
    }
}
