/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.utiles;

import java.util.List;
import kingdom.gameitems.BoardCell;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Const;
import kingdom.gameitems.Const.TileType;
import kingdom.gameitems.Tile;

/**
 *
 * @author andriy
 */
public class InitHelper {

    
    public static void createTiles(List<Tile> freeTiles) {
        freeTiles.clear();
        
        freeTiles.add(new Tile(TileType.RESOURCE, "Farm1", 6));
        freeTiles.add(new Tile(TileType.RESOURCE, "Farm2", 6));
        freeTiles.add(new Tile(TileType.RESOURCE, "Village1", 5));
        freeTiles.add(new Tile(TileType.RESOURCE, "Village2", 5));
        freeTiles.add(new Tile(TileType.RESOURCE, "City1", 4));
        freeTiles.add(new Tile(TileType.RESOURCE, "City2", 4));
        freeTiles.add(new Tile(TileType.RESOURCE, "Workshop1", 3));
        freeTiles.add(new Tile(TileType.RESOURCE, "Workshop2", 3));
        freeTiles.add(new Tile(TileType.RESOURCE, "Factory1", 2));
        freeTiles.add(new Tile(TileType.RESOURCE, "Factory2", 2));
        freeTiles.add(new Tile(TileType.RESOURCE, "Horticulture1", 1));
        freeTiles.add(new Tile(TileType.RESOURCE, "Horticulture2", 1));
        
        freeTiles.add(new Tile(TileType.HAZARD, "Hazard6", -6));
        freeTiles.add(new Tile(TileType.HAZARD, "Hazard5", -5));
        freeTiles.add(new Tile(TileType.HAZARD, "Hazard4", -4));
        freeTiles.add(new Tile(TileType.HAZARD, "Hazard3", -3));
        freeTiles.add(new Tile(TileType.HAZARD, "Hazard2", -2));
        freeTiles.add(new Tile(TileType.HAZARD, "Hazard1", -1));
        
        freeTiles.add(new Tile(TileType.MOUNTAIN, "Hountain1", 0));
        freeTiles.add(new Tile(TileType.MOUNTAIN, "Hountain2", 0));
        
        freeTiles.add(new Tile(TileType.GOLD, "Gold", 0));
        
        freeTiles.add(new Tile(TileType.WIZARD, "Wizard", 0));
        
        freeTiles.add(new Tile(TileType.DRAGON, "Dragon", 0));
        
    }

    
    public static void createBoardCells(BoardCell[][] boardCells) {
        
        for(int rInd=0; rInd < boardCells.length; ++rInd){
            boardCells[rInd] = new BoardCell[6];
            for(int cInd = 0; cInd < boardCells[rInd].length; ++cInd){
                boardCells[rInd][cInd] = new BoardCell();
            }
        }
    }

    
    public static void createCastles(List<Castle> freeCastles) {
        freeCastles.clear();
        
        freeCastles.add(new Castle(Const.UserColor.RED, 4));
        freeCastles.add(new Castle(Const.UserColor.RED, 3));
        freeCastles.add(new Castle(Const.UserColor.RED, 3));
        freeCastles.add(new Castle(Const.UserColor.RED, 2));
        freeCastles.add(new Castle(Const.UserColor.RED, 2));
        freeCastles.add(new Castle(Const.UserColor.RED, 2));
        freeCastles.add(new Castle(Const.UserColor.RED, 1));
        freeCastles.add(new Castle(Const.UserColor.RED, 1));
        freeCastles.add(new Castle(Const.UserColor.RED, 1));
        freeCastles.add(new Castle(Const.UserColor.RED, 1));
        
        freeCastles.add(new Castle(Const.UserColor.BLUE, 4));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 3));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 3));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 2));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 2));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 2));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 1));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 1));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 1));
        freeCastles.add(new Castle(Const.UserColor.BLUE, 1));
        
        freeCastles.add(new Castle(Const.UserColor.GREEN, 4));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 3));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 3));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 2));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 2));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 2));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 1));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 1));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 1));
        freeCastles.add(new Castle(Const.UserColor.GREEN, 1));
        
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 4));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 3));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 3));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 2));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 2));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 2));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 1));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 1));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 1));
        freeCastles.add(new Castle(Const.UserColor.YELLOW, 1));
    }
    
}
