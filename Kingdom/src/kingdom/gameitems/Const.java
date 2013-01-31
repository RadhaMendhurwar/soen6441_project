/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

/**
 * Keep all constants and types
 */
public class Const {
    
    /**
     * type of tile on the board
     */
    public enum TileType {
        RESOURCE,   // resource tile
        WIZARD,     // wizard tile
        MOUNTAIN,   // mountain tile
        HAZARD,     // hazard tile
        DRAGON,     // dragon tile
        GOLD,       // gold tile
        };
    
    /**
     * Color of the tile (and user)
     */
    public enum UserColor {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }
}