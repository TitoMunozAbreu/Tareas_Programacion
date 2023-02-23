package SoccerLeague.soccer;

public class Team {
    private String teamName;
    private Player[] playerArray;
    //Add an int field on Team to store the number of points scored in the League.
    private int pointsTotal;
    //add a new field to Team to store the goals total
    private int goalsTotal;

    public Team(){}
    public Team(String teamName){
        this.setTeamName(teamName);}

    public Team(String teamName, Player[] players){
        this.teamName = teamName;
        this.playerArray = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    //Add a method that increments the pointsTotal field by the value passed in.
    public void incPointsTotal(int pointsTotal){
        this.pointsTotal += pointsTotal;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }

    public void incTotalGoals(int goals){
        this.goalsTotal += goals;
    }
}
