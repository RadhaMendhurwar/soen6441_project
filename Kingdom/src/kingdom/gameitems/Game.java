/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

import java.util.List;
import kingdom.config.ConfigManager;

/**
 *
 * @author andriy
 */
public class Game {
    
    private static final ConfigManager confManager = new ConfigManager();
    /* current epoch */
    private int epoch;
    /* user that has a turn */
    private int currentUser;
    /* all many owned game(bank) */
    private int money;
    
    /* all not used tiles in the game (shuffled) */
    private List<Tile> freeTiles;
    /* list of actually playing users [2-4] */
    private List<User> activeUsers;
    /* board cells 5-rows, 6-columns [row][column] */
    private BoardItem[][] boardCells;
}
