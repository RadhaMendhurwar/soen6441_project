/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import kingdom.gameitems.Const.TileType;

/**
 * Class represent a tile
 */
public class Tile extends BorderItem{
    
    /* type of tile */
    private TileType tileType;
    /* how many colds it give when scored (can be positive or negative) */
    private int score;
    
    private final Icon coverIcon = new ImageIcon(getClass().getResource("/res/24x24/tile.png"));
     
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
     
    
    public String toString(){
        String result;
         switch(tileType){
            case RESOURCE:
            case HAZARD:
                result = String.valueOf(tileType) + "[" + score + "]";
                break;
            default: {
                result = String.valueOf(tileType);
            }
        }
        return result;
    }

    @Override
    public Icon getSmallImage() {
        return new ImageIcon(getClass().getResource("/res/tile1.png"));
    }

    @Override
    public Icon getBigImage() {
        //TODO imlement proper image when exists
        return new ImageIcon(getClass().getResource("/res/coins/empty.png"));
    }

    public Icon getCoverIcon() {
        return coverIcon;
    }
    
}
