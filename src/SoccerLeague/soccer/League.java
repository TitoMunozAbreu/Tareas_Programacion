package SoccerLeague.soccer;

import SoccerLeague.utility.PlayerDatabase;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class League {
    public static void main(String[] args) {
        //instantiate League and run the various methods as instance methods
        League theLeague = new League();
        //Add a call to the createTeams method.
        Team[] theTeams = theLeague.createTeams("The Robins,TheCrows,The Sallows,TheGreens", 3);

        //add a call to the createGames method.
        Game[] theGames = theLeague.createGames(theTeams);

        //add a call to the playGame method and pass in the maximum number of goals.
        for(Game currGame: theGames){
            currGame.playGame(3);
            System.out.println(currGame.getDescription());
        }

        theLeague.showBestTeam(theTeams);

    }

    //createTeams method
    public Team[] createTeams(String teamNames, int teamSize){
        //Instantiate a new PlayerDatabase object at the start of the createTeams method.
        PlayerDatabase playerDB = new PlayerDatabase();
        //use a StringTokenizer to set up a for loop to iterate through however many teams have been specified
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames,",");

        //Create a Team array called theTeams.
        Team[] theTeams = new Team[teamNameTokens.countTokens()];

        //Write a for loop that iterates through the array and creates a new Team for each element
        for (int i = 0; i < theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }

        return theTeams;
    }

    //createTeams method
    public Game[] createGames(Team[] theTeams){
        //Instantiate an ArrayList to hold the games that you will create
        ArrayList<Game> theGames = new ArrayList<>();
        //Create a for loop to iterate through all the teams in the Team array
        for(Team homeTeam : theTeams){
            for(Team awayTeam : theTeams){
                //check that each teams are differents
                if(homeTeam!=awayTeam){
                    //create a Game for each iteration of the inner loop.
                    theGames.add(new Game(homeTeam,awayTeam));
                }
            }
        }
        return (Game[]) theGames.toArray( new Game[1] );
    }

    //Create a method called showBestTeam that receives a Team array and returns void.
    public void showBestTeam(Team[] theTeams){
        //Declare a variable to store the best team
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points");
        //Add a loop that iterates through the Team array and prints out the number of points that each team scores.
        for(Team currteam:theTeams){
            System.out.println(currteam.getTeamName() + " : " + currteam.getPointsTotal() + " points : " + currteam.getGoalsTotal() + " goals");
            //check whether currTeam has more points than currBestTeam.
            if(currteam.getPointsTotal() > currBestTeam.getPointsTotal()){
                currBestTeam = currteam;
            } else if (currteam.getPointsTotal() == currBestTeam.getPointsTotal()) {
                if(currteam.getGoalsTotal() > currBestTeam.getGoalsTotal()){
                    currBestTeam = currteam;
                }
            }
        }
        //write out the name of the winning team to the console.
        System.out.println("\nWinner of the league is " + currBestTeam.getTeamName());
    }

}
