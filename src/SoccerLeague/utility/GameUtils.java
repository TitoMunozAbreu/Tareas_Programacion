package SoccerLeague.utility;

import SoccerLeague.soccer.Game;
import SoccerLeague.soccer.Goal;

public class GameUtils {
    /**
     * AddGameGoals method
     * @param currGame
     *  Each goal will be randomly created with a random time, one or the other of the teams, and a player
     */
    public static void addGameGoals(Game currGame) {
        //Chek if there's any score in the currGame
        if (currGame.getGoals().length >= 1) {
            int contador = currGame.getGoals().length;
            int randomTime = 0;
            int randomTeam = 0;
            int randomPlayer = 0;

            while (contador >= 1){
                randomTime = (int)(Math.random()*(0-90+1)+90);
                randomTeam = (int)(Math.random()*2);

                if(randomTeam == 0){
                    randomPlayer = (int)(Math.random()* currGame.getHomeTeam().getPlayerArray().length);
                    Goal goal = new Goal(currGame.getHomeTeam().getPlayerArray()[randomPlayer], currGame.getHomeTeam(), randomTime);
                    currGame.getGoals()[contador-1] = goal;
                }

                if(randomTeam == 1){
                    randomPlayer = (int)(Math.random()* currGame.getAwayTeam().getPlayerArray().length);
                    Goal goal = new Goal(currGame.getAwayTeam().getPlayerArray()[randomPlayer], currGame.getAwayTeam(),randomTime);
                    currGame.getGoals()[contador-1] = goal;
                }
                contador--;
            }
        }
    }
}
