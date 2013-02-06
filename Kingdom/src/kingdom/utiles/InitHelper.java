/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.utiles;

import java.util.ArrayList;
import java.util.List;
import kingdom.gameitems.BoardCell;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Const;
import kingdom.gameitems.Const.TileType;
import kingdom.gameitems.Const.UserColor;
import kingdom.gameitems.Tile;
import kingdom.gameitems.User;

/**
 * Helper class to create default properties for all objects (Game, User, ...)
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

    /**
     * select specific Color castles from container of castles. Selected castles are removed from 
     * <code>freeCastles</code> container.
     * @param freeCastles all available castles
     * @param color Color to select castles for
     * @return List of all castles with requested Color
     */
    public static List<Castle> getCastlesForColor(List<Castle> freeCastles, UserColor color, int numberOfUsers) {
        int rank1castleCounter = 0;
        
        List<Castle> result = new ArrayList<Castle>();
        for(Castle castle : freeCastles){
            if(castle.getColor() == color){
                // one rank castles are limited dependant of number of user in the game
                // 2users - 4
                // 3users - 3
                // 4users - 2
                if(castle.getRank() == 1){
                    switch(numberOfUsers){
                        case 4:// 4users - 2
                            if(rank1castleCounter >= 2){
                                continue;
                            }
                            break;
                        case 3: // 3users - 3
                            if(rank1castleCounter >= 3){
                                continue;
                            }
                            break;
                        case 2: // 2users - 4
                            if(rank1castleCounter >= 4){
                                continue;
                            }
                            break;
                    }
                }
                result.add(castle);
                
                if(castle.getRank() == 1){
                    rank1castleCounter++;
                }
            }
        }
        
        //remove all unused castles (when less then 4 user is playing 
        
        
        freeCastles.removeAll(result);
        return result;
    }

    public static void removeUnusedCastles(List<Castle> freeCastles, List<User> activeUsers) {
        List<Castle> notUsedCastles = new ArrayList<Castle>();
        
        // init all available colors
        List<UserColor> allColors = new ArrayList<UserColor>(4);
        allColors.add(UserColor.BLUE);
        allColors.add(UserColor.GREEN);
        allColors.add(UserColor.RED);
        allColors.add(UserColor.YELLOW);
        
        //remove used colors
        for(User u: activeUsers){
            allColors.remove(u.getColor());
        }
        
        //remove not used color's castles 
        for(UserColor col : allColors){
            for(Castle c : freeCastles){
                if(c.getColor() == col){
                    notUsedCastles.add(c);
                }
            }
        }
        
        freeCastles.removeAll(notUsedCastles);
    }
    
}
