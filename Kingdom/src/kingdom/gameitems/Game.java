/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

import java.util.ArrayList;
import java.util.List;
import kingdom.config.ConfigManager;
import kingdom.config.GameConfig;
import kingdom.config.PropertyChangeProvider;
import kingdom.config.StartWizardConfig;
import kingdom.utiles.InitHelper;
import kingdom.utiles.MoneyManager;
import kingdom.utiles.RandomHelper;

/**
 * Them main class (engine) of the game. The class contains all object to be able to run the game.
 * Instance of the class has to be created once at the beginning. This class has corespondent class GameConfig, that may be stored/restored.
 * The class has to be Singleton. (will be implemented later).
 */
public class Game extends PropertyChangeProvider{
    
    private static Game theInstance = null;
    private static final ConfigManager confManager = new ConfigManager();
    
    /**
     * fired after new config is set for the Game
     */
    public static final String PROP_SET_CONFIG = "newConfigIsSet";
    
    /* current epoch */
    private int epoch;
    public static final String PROP_EPOCH = "epoch";
    
    /* user that has a turn */
    private int currentUser;
    public static final String PROP_CURRENT_USER = "currentUser";
    
    /* all many owned game(bank) */
    private int[] bankWallet = new int[MoneyManager.WALLET_SIZE];
    public static final String PROP_MONEY = "bankWallet";
    
    /* all not used tiles in the game (shuffled) */
    private List<Tile> freeTiles = new ArrayList(23);
    public static final String PROP_FREETILES = "freeTiles";
    
     /* all not used castles in the game */
    private List<Castle> freeCastles = new ArrayList(16);
    public static final String PROP_FREE_CASTLES = "freeCastles";
    
    /* list of actually playing users [2-4] */
    private List<User> activeUsers = new ArrayList(4);
    public static final String PROP_ACTIVE_USERS = "activeUsers";
    
    /* board cells 5-rows, 6-columns [row][column] */
    private BoardCell[][] boardCells = new BoardCell[5][]; //[row][column];
    public static final String PROP_BOARD_CELLS = "boardCells";
    
    /**
     * Main method to get reference to singleton Game object
     * <p>Method is thread safe
     * @return Object Game. (Singleton)
     */
    public static Game getInstance() {
        if (theInstance == null) {
            synchronized (Game.class) {
                if (theInstance == null) {
                    theInstance = new Game();
                    return theInstance;
                } else {
                    return theInstance;
                }
            }
        } else {
            return theInstance;
        }
    }
    
    /**
     * may be removed later if not required
     */
    private Game(){
        init();
    }

    private void init() {
        InitHelper.createBoardCells(boardCells);
        InitHelper.createTiles(freeTiles);
        InitHelper.createCastles(freeCastles);
        
        /* 1$, 5$, 10$, 50$, 100$ */
        this.bankWallet = new int[] {19, 12, 20, 8, 4};
        
        this.currentUser = 0;
        this.epoch = 0;
    }
    
    /**
     * Generate Configuration from actual state of the class Game, and save this configuration into file system.
     * @return true if success
     */
    public boolean saveAllConfigs(){
        GameConfig gc = new GameConfig(this);
        return confManager.saveConfig(gc);
    }
    
    /**
     * Load previously saved configuration from file system. Update actual class Game with all properties loaded from configuration. 
     * @return true if success
     */
    public boolean loadAllConfigs(){
        GameConfig conf = confManager.loadConfig();
        return this.updateThisByConfig(conf);
    }
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////
    // accessors                                                                        //
    //////////////////////////////////////////////////////////////////////////////////////

    /**
     *
     * @return   current epoch of the game
     */
    public int getEpoch() {
        return epoch;
    }

    /**
     *
     * @param epoch  current epoch of the game
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
     * @return wallet (money in Game Money Bank)
     */
    public int[] getBankWallet() {
        return bankWallet;
    }

    /**
     *
     * @return Tiles that belong to Game (in Tile bank). (not assigned to user OR gameBorder)
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
     *
     * @return Two dimensional array that represent a border cells size 5x6 [row][column]
     */
    public BoardCell[][] getBoardCells() {
        return boardCells;
    }

    /**
     *
     * @param boardCells  Two dimensional array that represent a border cells size 5x6 [row][column]
     */
    public void setBoardCells(BoardCell[][] boardCells) {
        this.boardCells = boardCells;
    }

    /**
     * Copies all parameters from configuration into actual object
     * @param conf Configuration initialised from file in file system
     * @return  true if success
     */
    private boolean updateThisByConfig(GameConfig conf) {

        this.epoch = conf.getEpoch();
        this.currentUser = conf.getCurrentUser();
        this.bankWallet = conf.getBankWallet();
        this.freeTiles = conf.getFreeTiles();
        /* all not used castles in the game */
        this.freeCastles = conf.getFreeCastles();
        /* list of actually playing users [2-4] */
        this.activeUsers = conf.getActiveUsers();
        
        List<BorderItem> placedItems = conf.getPlacedItems();

        // create all border cells based on saved items that was on the board
        for (int r = 0; r < this.boardCells.length; ++r) {
            boardCells[r] = new BoardCell[6];
            for (int c = 0; c < boardCells[r].length; ++c) {
                boardCells[r][c] = new BoardCell(placedItems.get(c + Const.COLS * r));
            }
        }

        // update (refresh) UI
        firePropertyChange(PROP_SET_CONFIG, null, null);
        return true;
    }

    /**
     * Method copies all properties from StartWizardConfig into Game object. After calling of this method, the 
     * game is initialised from Wizard and can be started
     * @param wizConfig
     */
    public void setStartInformation(StartWizardConfig wizConfig) {
        this.activeUsers.clear();
        this.epoch = 0;
        int numberOfUsers = wizConfig.getSelectedNumberOfUser();
        
        this.activeUsers.add(new User(wizConfig.getUsename0(), 0, wizConfig.getUserColor0()));
        this.activeUsers.add(new User(wizConfig.getUsename1(), 1, wizConfig.getUserColor1()));
        if(numberOfUsers > 2){
            this.activeUsers.add(new User(wizConfig.getUsename2(), 2, wizConfig.getUserColor2()));
        }
        if(numberOfUsers > 3){
            this.activeUsers.add(new User(wizConfig.getUsename3(), 3, wizConfig.getUserColor3()));
        }
        
        // set all start game values for all objects
        initGameBegin();
    }

    /**
     * Change current user to next in cycle order.
     * @return User object next to user before call
     */
    public User switchNextUser() {
        
        if(activeUsers.isEmpty()){
            return null;
        }
        
        if(currentUser + 1 >= activeUsers.size()){
            currentUser = 0;
        } else {
            currentUser++;
        }
        return activeUsers.get(currentUser);
    }

    /* does all game initialization (shuffling, default selection, default start user, ... */
    private void initGameBegin() {
        
        // select random start user
        this.currentUser = RandomHelper.getRandom(activeUsers.size());
        
        // shuffle all tiles 200 times
        RandomHelper.shuffleList(freeTiles, 200);
        
        // set users tile and custles
        for(User user: activeUsers){
            // assign randomly one tile to each user
            user.setOwnedTile(freeTiles.remove(0));
            // assign all custles of specific color to user with same color
            user.setCastles(InitHelper.getCastlesForColor(freeCastles, user.getColor(), activeUsers.size()));
        }
        
        // remove from Bank amount given for users
        MoneyManager.withdrawMoney(bankWallet, MoneyManager.c50, activeUsers.size());
        
        // remove unused castles (because of less then 4 user is plaing
        InitHelper.removeUnusedCastles(freeCastles, activeUsers);
        
        // update (refresh) UI
        firePropertyChange(PROP_SET_CONFIG, null, null);
    }
    
    
}
