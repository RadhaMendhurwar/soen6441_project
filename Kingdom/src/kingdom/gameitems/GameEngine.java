/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

import java.util.List;

/**
 *
 * @author andriy
 */
public class GameEngine {
    
    /* current epoch */
    private int epoch;
    /* user that has a turn */
    private int currentUser;
    
    /* all many owned game(bank) */
    private int coins1;
    private int coins5;
    private int coins10;
    private int coins50;
    private int coins100;
    
    /* all not used tiles in the game (shuffled) */
    private List<Tile> freeTiles;
    /* list of actually playing users [2-4] */
    private List<User> activeUsers;
    
    /* board cells 5-rows, 6-columns [row][column] */
    private BoardItem[][] boardCells;
}
