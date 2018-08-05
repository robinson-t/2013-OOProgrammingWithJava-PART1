/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
import java.util.ArrayList;


public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private int maxSize;
    

    public Team(String name) {
        this.teamName = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName() {
        return this.teamName;
    }
    
    public void addPlayer(Player player) {
        if (size() < this.maxSize) {
            this.players.add(player);
        }
        
    }
    
    public void printPlayers() {
        for (Player players : this.players) {
            System.out.println(players);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        int no = 0;
        for (Player players2 : this.players) {
            no++;
        }
        return no;
    }
    
    public int goals() {
        int goals = 0;
        for (Player playergoals : this.players) {
            goals += playergoals.goals();
        }
        return goals;
    }
}
