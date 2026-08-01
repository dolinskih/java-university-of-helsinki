public class Game {
    private String team;
    private boolean won;

    public Game(String team, boolean won) {
        this.team = team;
        this.won = won;
    }

    public String getTeam() {
        return this.team;
    }

    public boolean getWon() {
        return this.won;
    }
}
