import java.util.ArrayList;

public class TeamSeason extends Team {
    private int position;
    private String name;
    private ArrayList<Player> players;

    TeamSeason(){

    }

    TeamSeason(String name){
        this.setName(name);
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }
    public void addPlayer(Player player){
        //this.players;
        return;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int position){
        this.position = position;
        return;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}