/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

import kingdom.gameitems.Const.TileType;

/**
 * Class represent a tile
 */
public class Tile extends BorderItem{
    
     /* type of tile */
     private TileType tileType;
     /* how many colds it give when scored (can be positive or negative) */
     private int score;
     
     /**
     *
     * @param type type of tile {@link TileType}
     * @param title Text will be shown in the cell when the tile is placed into game border cell
     * @param score score that this tile gives to user when line/column is scored
     */
    public Tile(TileType type, String title, int score){
         super(title);
         this.tileType = type;
         this.score = score;
     }

    /**
     *
     * @return  type of tile {@link TileType}
     */
    public TileType getTileType() {
        return tileType;
    }

    /**
     *
     * @return  score that this tile gives to user when line/column is scored
     */
    public int getScore() {
        return score;
    }
     
     
}
