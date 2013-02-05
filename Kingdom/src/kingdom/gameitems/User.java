/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

import java.util.List;
import kingdom.gameitems.Const.UserColor;

/**
 * Represent a user in the game
 */
public class User {
    
    /* id of user 0-3 */
    private int id;
    /* user name */
    private String userName;
    /* single tile owned by user */
    private Tile ownedTile;
    /* castles owned by user */
    private List<Castle> castles;
    /* user color */
    private UserColor color;
    
    /* all many owned by user */
    private int money;
    
    public User(String name, int id, UserColor color){
        this.userName = name;
        this.id = id;
        this.color = color;
        this.money = 50;
    }
    
    /**
     *
     * @return generated unique id of user (may be not needed, so may be deleted later)
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id generated unique id of user (may be not needed, so may be deleted later)
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return username provided at the beginning of the game
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName username provided at the beginning of the game
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return single tile owned by user
     */
    public Tile getOwnedTile() {
        return ownedTile;
    }

    /**
     *
     * @param ownedTile single tile owned by user
     */
    public void setOwnedTile(Tile ownedTile) {
        this.ownedTile = ownedTile;
    }

    /**
     *
     * @return all castles owned by user
     */
    public List<Castle> getCastles() {
        return castles;
    }

    /**
     *
     * @param castles all castles owned by user
     */
    public void setCastles(List<Castle> castles) {
        this.castles = castles;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public UserColor getColor() {
        return color;
    }

    public void setColor(UserColor color) {
        this.color = color;
    }
    
    
    
}
