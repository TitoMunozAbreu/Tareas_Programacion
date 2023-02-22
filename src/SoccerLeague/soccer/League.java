package SoccerLeague.soccer;

import SoccerLeague.utility.GameUtils;

public class League {
    public static void main(String[] args) {
        //instantiate League and run the various methods as instance methods
        League theLeague = new League();
        //Add a call to the createTeams method.
        Team[] theTeams = theLeague.createTeams();

        //add a call to the createGames method.
        Game[] theGames = theLeague.createGames(theTeams);

        //create a Game object and populate the homeTeam and awayTeam attributes.
        Game currGame = theGames[0];
        //add a call to the playGame method and pass in the maximum number of goals.
        currGame.playGame();

        System.out.println(currGame.getDescription());




    }

    //createTeams method
    public Team[] createTeams(){
        //Instantiate a number of Player objects for each Team.
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Green");
        Player player3 = new Player("Geoffrey Chaucer");

        //Create a Player array called thePlayers
        Player[] thePlayers = {player1, player2, player3};

        //Declare and instantiate a Team object.
        Team team1 = new Team("The Greens");
        //create a Team called team2 and name it "The Reds".
        Team team2 = new Team("The Reds");

        //Set the playerArray attribute of the Team object to the Player array thePlayers.
        team1.playerArray = thePlayers;

        //Create a three-element Player array and assign it to the playerArray reference of the Team object
        team2.playerArray = new Player[3];

        //Add a player named "Robert Service" to the first element of playerArray.
        team2.playerArray[0] = new Player("Robert Service");

        //Add two new Player objects with playerName attributes set to "Robbie Burns" and "Rafael Sabatini"
        team2.playerArray[1] = new Player("Robbie Burns");
        team2.playerArray[2] = new Player("Rafael Sabatini");

        Team[] theTeams = {team1, team2};

        return theTeams;
    }

    //createTeams method
    public Game[] createGames(Team[] theTeams){
        //Game object needs to have homeTeam and awayTeam set;
        Game theGame = new Game(theTeams[0], theTeams[1]);
        //Create a Game array with theGame as its only element
        Game[] theGames = {theGame};

        return theGames;
    }



}
