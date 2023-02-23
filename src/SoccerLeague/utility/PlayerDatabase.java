package SoccerLeague.utility;

import SoccerLeague.soccer.Player;

import java.util.*;

public class PlayerDatabase {
    //declare an ArrayList of type Player
    ArrayList<Player> players;

    public PlayerDatabase(){
        //create a StringTokenizer authorTokens that is built on the authorList String.
        StringTokenizer authorTokens = new StringTokenizer(authorList,",");
        //Instantiate the ArrayList players
        players = new ArrayList<>();

        //Create a while loop to iterate through the StringTokenizer
        while (authorTokens.hasMoreTokens()){
            players.add(new Player(authorTokens.nextToken()));
        }
    }

    //Create a method, getTeam, that takes an int (numberOfPlayers) and returns an array of Players.
    public Player[] getTeam(int numberOfPlayers){
        //create a Player array named teamPlayers.
        Player[] teamPlayer = new Player[numberOfPlayers];
        //Now create a for loop to iterate through this array.
        for(int i = 0; i < numberOfPlayers; i++){
            //randomly select a Player from the players ArrayList and add that player to the teamPlayers array
            int playerIndex = (int)(Math.random()*players.size());
            teamPlayer[i] = players.get(playerIndex);
            //Remove the player just selected from the players ArrayList
            players.remove(playerIndex);
        }
        return teamPlayer;
    }

    String authorList =
            "Agatha Christie," +
                    "Alan Patton," +
                    "Alexander Solzhenitsyn," +
                    "Arthur Conan Doyle," +
                    "Anthony Trollope," +
                    "Baroness Orczy," +
                    "Brendan Behan," +
                    "Brian Moore," +
                    "Boris Pasternik," +
                    "Charles Dickens," +
                    "Charlotte Bronte," +
                    "Dorothy Parker," +
                    "Emile Zola," +
                    "Frank O'Connor," +
                    "Geoffrey Chaucer," +
                    "George Eliot," +
                    "G. K. Chesterton," +
                    "Graham Green," +
                    "Henry James," +
                    "James Joyce," +
                    "J. M. Synge," +
                    "J. R. Tolkien," +
                    "Jane Austin," +
                    "Leo Tolstoy," +
                    "Liam O'Flaherty," +
                    "Marcel Proust," +
                    "Mark Twain," +
                    "Oscar Wilde," +
                    "O. Henry," +
                    "Samuel Beckett," +
                    "Sean O'Casey," +
                    "William Shakespeare," +
                    "William Makepeace Thackeray," +
                    "W. B. Yeats," +
                    "Wilkie Collins";




}
