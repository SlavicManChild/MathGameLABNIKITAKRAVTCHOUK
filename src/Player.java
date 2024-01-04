public class Player {

    private String name;
    private int score;

    private int wins;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getWins(){return wins;}

    public void setWin(int num){wins = 0;}

    public void addWin(){wins++;}

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
    }
}