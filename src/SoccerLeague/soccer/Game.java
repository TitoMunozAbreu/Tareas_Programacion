package SoccerLeague.soccer;

import SoccerLeague.utility.GameUtils;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public Game(){}
    public Game(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    //create a new method playGame
    public void playGame(int maxGoals){
        //Add the code to create a random number of goals between 0 and 6
        int numberOfGoals = (int) (Math.random()*(maxGoals + 1));

        //instantiate the Goal array using numberOfGoals to give it the correct number of elements.
        this.goals = new Goal[numberOfGoals];

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
    StringBuilder returnString = new StringBuilder();

        for(Goal currGoals:this.goals){
         returnString.append("Goal scored after " + currGoals.theTime
                            + " mins by " + currGoals.thePlayer.playerName
                            + " of " + currGoals.theTeam.teamName + "\n");
        }
        return returnString.toString();
    }

}
