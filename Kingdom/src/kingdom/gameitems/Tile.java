/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

import kingdom.gameitems.Const.TileType;

/**
 *
 */
public class Tile extends BorderItem{
    
     /*  */
     private TileType tileType;
     /* how many colds it give when scored (can be positive or negative) */
     private int score;
     
     public Tile(TileType type, String title, int score){
         super(title);
         this.tileType = type;
         this.score = score;
     }

    public TileType getTileType() {
        return tileType;
    }

    public int getScore() {
        return score;
    }
     
     
}
