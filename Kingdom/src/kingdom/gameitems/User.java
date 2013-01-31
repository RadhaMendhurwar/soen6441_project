/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

import java.util.List;

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
    
    /* all many owned by user */
    private int coins1;
    private int coins5;
    private int coins10;
    private int coins50;
    private int coins100;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Tile getOwnedTile() {
        return ownedTile;
    }

    public void setOwnedTile(Tile ownedTile) {
        this.ownedTile = ownedTile;
    }

    public List<Castle> getCastles() {
        return castles;
    }

    public void setCastles(List<Castle> castles) {
        this.castles = castles;
    }
    
    
}
