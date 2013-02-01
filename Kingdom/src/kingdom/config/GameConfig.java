package kingdom.config;

import java.util.ArrayList;
import java.util.List;
import kingdom.gameitems.BoardCell;
import kingdom.gameitems.BorderItem;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Game;
import kingdom.gameitems.Tile;
import kingdom.gameitems.User;

/**
 * Contains all properties of application
 * This is the main class to communicate with to get/set properties
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
    //private BoardCell[][] boardCells; //[row][column];
    private List<BorderItem> placedItems = new ArrayList<BorderItem>();

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

    public int getEpoch() {
        return epoch;
    }

    public void setEpoch(int epoch) {
        this.epoch = epoch;
    }

    public int getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(int currentUser) {
        this.currentUser = currentUser;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Tile> getFreeTiles() {
        return freeTiles;
    }

    public void setFreeTiles(List<Tile> freeTiles) {
        this.freeTiles = freeTiles;
    }

    public List<Castle> getFreeCastles() {
        return freeCastles;
    }

    public void setFreeCastles(List<Castle> freeCastles) {
        this.freeCastles = freeCastles;
    }

    public List<User> getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(List<User> activeUsers) {
        this.activeUsers = activeUsers;
    }

    public List<BorderItem> getPlacedItems() {
        return placedItems;
    }

    public void setPlacedItems(List<BorderItem> placedItems) {
        this.placedItems = placedItems;
    }

    
}
