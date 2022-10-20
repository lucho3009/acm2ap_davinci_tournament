public class Player {
    private String name;
    private String position;
    private int number;
    private int goalCounter;
    private int matchCounter;

    Player(String name){
        this.setName(name);
        this.setMatchCounter(0);
        this.setGoalCounter(0);
    }
    
    Player(String name, int number, String position) {
        this.setMatchCounter(0);
        this.setGoalCounter(0);
        this.setNumber(number);
        this.setName(name);
    }

    //NAME SETTER
    public void setName(String name){
        this.name = name;
        return;
    }

    //NAME GETTER
    public String getName() {
        return this.name;
    }
    //NAME GETTER
    public void setPosition(String position) {
        this.position = position;
        return;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

    public int getMatchCounter() {
        return matchCounter;
    }

    public void setMatchCounter(int matchCounter) {
        this.matchCounter = matchCounter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }
}