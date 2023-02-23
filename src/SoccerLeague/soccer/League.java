package SoccerLeague.soccer;

public class League {
    public static void main(String[] args) {
        //instantiate League and run the various methods as instance methods
        League theLeague = new League();
        //Add a call to the createTeams method.
        Team[] theTeams = theLeague.createTeams();

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
    public Team[] createTeams(){
        //Instantiate a number of Player objects for each Team.
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Green");
        Player player3 = new Player("Geoffrey Chaucer");

        //Create a Player array called thePlayers
        Player[] thePlayers = {player1, player2, player3};

        //Declare and instantiate a Team object.
        Team team1 = new Team("The Greens", thePlayers);
        //create a Team called team2 and name it "The Reds".
        Team team2 = new Team("The Reds");

        //Create a three-element Player array and assign it to the playerArray reference of the Team object
        team2.setPlayerArray(new Player[3]);

        //Add a player named "Robert Service" to the first element of playerArray.
        team2.getPlayerArray()[0] = new Player("Robert Service");

        //Add two new Player objects with playerName attributes set to "Robbie Burns" and "Rafael Sabatini"
        team2.getPlayerArray()[1] = new Player("Robbie Burns");
        team2.getPlayerArray()[2] = new Player("Rafael Sabatini");

        Team[] theTeams = {team1, team2};

        return theTeams;
    }

    //createTeams method
    public Game[] createGames(Team[] theTeams){
        //Game object needs to have homeTeam and awayTeam set;
        Game theGame = new Game(theTeams[0], theTeams[1]);
        //add some more games to the Game array so that four games are played in total
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);

        //Create a Game array with theGame as its only element
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};

        return theGames;
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
