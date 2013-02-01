/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.config;

import java.io.File;
import kingdom.gameitems.BorderItem;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Const;
import kingdom.gameitems.Game;
import kingdom.gameitems.Tile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andriy
 */
public class ConfigManagerTest {
    
    public ConfigManagerTest() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveConfig method, of class ConfigManager.
     */
    @Test
    public void testSaveConfig() {
        System.out.println("saveConfig");

        //delete file if exists
        File saved = new File(Const.GAME_HOME_FOLDER + ConfigManager.OUT_FILE);
        if (saved.exists()) {
            saved.delete();
        }

        Game game = new Game();
        game.setEpoch(2);
        game.getBoardCells()[0][3].setItem(game.getFreeTiles().get(3));
        game.getBoardCells()[2][1].setItem(game.getFreeCastles().get(3));
        game.saveAllConfigs();

        assertEquals(true, saved.exists());
    }

    /**
     * Test of loadConfig method, of class ConfigManager.
     */
    @Test
    public void testLoadConfig() {
        System.out.println("loadConfig");
        
        Game game = new Game();
        game.loadAllConfigs();
        
        int result = game.getEpoch();
        assertEquals(result, 2);
        
        Tile onBoardTile = (Tile) game.getBoardCells()[0][3].getItem();
        assertEquals(Const.TileType.RESOURCE, onBoardTile.getTileType()); // resource
        
        Castle onBoardCastle = (Castle) game.getBoardCells()[2][1].getItem();
        assertEquals(2, onBoardCastle.getRank());
        
        BorderItem empty1 = game.getBoardCells()[0][0].getItem();
        assertEquals(null, empty1);
        
        BorderItem empty2 = game.getBoardCells()[4][5].getItem();
        assertEquals(null, empty2);
    }

}
