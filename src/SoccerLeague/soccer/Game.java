package SoccerLeague.soccer;

import SoccerLeague.utility.GameUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    //Add a LocalDateTime attribute, theDateTime
    private LocalDateTime theDateTime;

    public Game(){}
    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime){
        this.setHomeTeam(homeTeam);
        this.setAwayTeam(awayTeam);
        this.theDateTime = theDateTime;
    }

    //create a new method playGame
    public void playGame(int maxGoals){
        //Add the code to create a random number of goals between 0 and 6
        int numberOfGoals = (int) (Math.random()*(maxGoals + 1));

        //instantiate the Goal array using numberOfGoals to give it the correct number of elements.
        this.setGoals(new Goal[numberOfGoals]);

        //call the addGameGoals method of the GameUtils class.
        GameUtils.addGameGoals(this);
    }
    //Add another playGame method to Game. It should return nothing and receive no parameters.
    public void playGame(){
        //call the parameter version of the playGame method
        playGame(6);
    }

    //Create a new method on the Game class to return a description of the game.
    public String getDescription(){
        //declare two int variables to hold the score for each team
        int homeTeamGoals = 0, awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        //Display which teams are playing
        returnString.append(this.homeTeam.getTeamName() + " vs. "
                            +this.awayTeam.getTeamName() + "\n"
                            + "Date " + this.theDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");

        for(Goal currGoals: this.getGoals()){
            if(currGoals.getTheTeam().equals(this.homeTeam)){
                homeTeamGoals++;
                //add a line to increment the Team object with each goal scored by each team.
                this.homeTeam.incTotalGoals(1);

            }else{
                awayTeamGoals++;
                this.homeTeam.incTotalGoals(1);
            }
            returnString.append("Goal scored after " + currGoals.getTheTime()
                    + " mins by " + currGoals.getThePlayer().getPlayerName()
                    + " of " + currGoals.getTheTeam().getTeamName() + "\n");
        }

        if(homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw \n");
            //Scored points
            this.homeTeam.incPointsTotal(1);
            this.awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(this.homeTeam.getTeamName() + " win (" + homeTeamGoals + " - " + awayTeamGoals + ")\n" );
            //Scored points
            this.homeTeam.incPointsTotal(2);
        }else {
            returnString.append(this.awayTeam.getTeamName() + " win (" + awayTeamGoals + " - " + homeTeamGoals + ")\n" );
            //Scored points
            this.awayTeam.incPointsTotal(2);
        }

        return returnString.toString();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }
}
