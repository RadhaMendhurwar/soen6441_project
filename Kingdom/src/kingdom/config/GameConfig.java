/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.config;

import java.util.ArrayList;
import java.util.List;
import kingdom.gameitems.BoardCell;
import kingdom.gameitems.BorderItem;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Const;
import kingdom.gameitems.Game;
import kingdom.gameitems.Tile;
import kingdom.gameitems.User;

/**
 * Contains all properties of application
 * This is the main class to read/write to properties of the game.
 * Class must be stored into file system before game exit
 * @author andriy
 */
public class GameConfig {
    
    /* current epoch */
    private int epoch;
    /* user that has a turn */
    private int currentUser;
    /* all many owned game(bank) */
    private int money;
    
    /* all not used tiles in the game (shuffled) */
    private List<Tile> freeTiles;
     /* all not used castles in the game */
    private List<Castle> freeCastles;
    /* list of actually playing users [2-4] */
    private List<User> activeUsers;
    /* board cells 5-rows, 6-columns [row][column] */
    private List<BorderItem> placedItems = new ArrayList<BorderItem>();

    /**
     * Create instance of class and copy all properties of <code>Game</code> class.
     * @param game Existent <code>Game</code> class to copy all properties from.
     */
    public GameConfig(Game game) {
        this.epoch = game.getEpoch();
        this.currentUser = game.getCurrentUser();
        this.money = game.getMoney();
        
        this.freeTiles = game.getFreeTiles();
        this.freeCastles = game.getFreeCastles();
        this.activeUsers = game.getActiveUsers();
        BoardCell[][] boardCells = game.getBoardCells();
        
        for(BoardCell[] row : boardCells){
            for(BoardCell cell: row){
                placedItems.add(cell.getItem());
            }
        }
    }

    /**
     *
     * @return  current epoch of the game
     */
    public int getEpoch() {
        return epoch;
    }

    /**
     *
     * @param epoch current epoch of the game
     */
    public void setEpoch(int epoch) {
        this.epoch = epoch;
    }

    /**
     *
     * @return number of user that has to perform operation (actual user)
     */
    public int getCurrentUser() {
        return currentUser;
    }

    /**
     *
     * @param currentUser number of user that has to perform operation (actual user)
     */
    public void setCurrentUser(int currentUser) {
        this.currentUser = currentUser;
    }

    /**
     *
     * @return total amount of money in Game Money Bank
     */
    public int getMoney() {
        return money;
    }

    /**
     *
     * @param money total amount of money in Game Money Bank
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     *
     * @return  Tiles that belong to Game (in Tile bank). (not assigned to user OR gameBorder)
     */
    public List<Tile> getFreeTiles() {
        return freeTiles;
    }

    /**
     *
     * @param freeTiles Tiles that belong to Game (in Tile bank). (not assigned to user OR gameBorder)
     */
    public void setFreeTiles(List<Tile> freeTiles) {
        this.freeTiles = freeTiles;
    }

    /**
     *
     * @return castles that belong to Game. (not assigned to user OR gameBorder)
     */
    public List<Castle> getFreeCastles() {
        return freeCastles;
    }

    /**
     *
     * @param freeCastles castles that belong to Game. (not assigned to user OR gameBorder)
     */
    public void setFreeCastles(List<Castle> freeCastles) {
        this.freeCastles = freeCastles;
    }

    /**
     *
     * @return list of active users (2-4)
     */
    public List<User> getActiveUsers() {
        return activeUsers;
    }

    /**
     *
     * @param activeUsers list of active users (2-4)
     */
    public void setActiveUsers(List<User> activeUsers) {
        this.activeUsers = activeUsers;
    }

    /**
     * @return List of BorderItem. The size of list is always 30. it start with border cell [0][0] and ends with [4][5]. Each Item from 
     * border cell is stored in same order in the list. Cells without item (empty cell) have NULL value in the list.
     * Items in the list are stored in order (col# + 6 * row#);
     */
    public List<BorderItem> getPlacedItems() {
        return placedItems;
    }

    /**
     *
     * @param placedItems List of BorderItem. The size of list is always 30. it start with border cell [0][0] and ends with [4][5]. Each Item from 
     * border cell is stored in same order in the list. Cells without item (empty cell) have NULL value in the list.
     * Items in the list are stored in order (col# + 6 * row#)
     */
    public void setPlacedItems(List<BorderItem> placedItems) {
        this.placedItems = placedItems;
    }

    
}
