package SoccerLeague.soccer;

public class Goal {
    private Team theTeam;
    private Player thePlayer;
    private int theTime;

    public Goal(){}

    public Goal(Player thePlayer, Team theTeam, int theTime){
        this.setThePlayer(thePlayer);
        this.setTheTeam(theTeam);
        this.setTheTime(theTime);
    }

    public Team getTheTeam() {
        return theTeam;
    }

    public void setTheTeam(Team theTeam) {
        this.theTeam = theTeam;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public int getTheTime() {
        return theTime;
    }

    public void setTheTime(int theTime) {
        this.theTime = theTime;
    }
}
