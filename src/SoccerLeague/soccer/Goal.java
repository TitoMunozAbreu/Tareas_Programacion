package SoccerLeague.soccer;

public class Goal {
    public Team theTeam;
    public Player thePlayer;
    public int theTime;

    public Goal(){}

    public Goal(Player thePlayer, Team theTeam, int theTime){
        this.thePlayer = thePlayer;
        this.theTeam = theTeam;
        this.theTime = theTime;
    }

}
