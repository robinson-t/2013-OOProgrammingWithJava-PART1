/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
public class Player {
    private String playerName;
    private int noofGoals;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player(String playerName, int noofGoals) {
        this.playerName = playerName;
        this.noofGoals = noofGoals;
    }
    
    public String getName() {
        return this.playerName;
    }
    
    public int goals() {
        return this.noofGoals;
    }

    @Override
    public String toString() {
        return playerName + ", goals " + this.noofGoals; 
    }
   
    
    
    
}
