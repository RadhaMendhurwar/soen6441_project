/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.config;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kingdom.gameitems.Const;

/**
 * Instance of the class contains all functionality to save/restore/getDefault state of Game.
 * Normally It will save the main configuration class <code>GameConfig.java</code> which will have all properties of Game. 
 */
public class ConfigManager {

    /**
     * XML file name where configuration is saved
     */
    public static final String OUT_FILE = "game_config.xml";

    /**
     * Store <code>gameConfig</code> object into xml file in file system. 
     * @param gameConfig main configuration object of the Game. It contains all properties of game state.
     * @param fileName name of file to save the config (relative to Application folder)
     * @return true if success
     */
    public boolean saveConfig(GameConfig gameConfig, String fileName) {
        String fileToSave = (fileName == null || fileName.isEmpty()) ? OUT_FILE : fileName;
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(gameConfig);
        try {
            String outFilePath = Const.GAME_HOME_FOLDER + fileToSave;

            File gameDirectory = new File(Const.GAME_HOME_FOLDER);
            if (!gameDirectory.exists()) {
                gameDirectory.mkdirs();
            }

            File outFile = new File(outFilePath);
            if (!outFile.exists()) {
                outFile.createNewFile();
            }

            xstream.toXML(gameConfig, new BufferedWriter(new FileWriter(outFilePath)));

        } catch (IOException ex) {
            Logger.getLogger(ConfigManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    /**
     * Restore <code>gameConfig</code> object from xml file in file system. 
     * @param  fileName file name (relative to application folder).
     * @return Previously saved <code>gameConfig</code> object. Or NULL if some problem.
     */
    public GameConfig loadConfig(String fileName) {
        Object obj;
        try {
            XStream xstream = new XStream(new DomDriver());
            obj = xstream.fromXML(new File(Const.GAME_HOME_FOLDER + fileName));

            if (obj != null) {
                GameConfig conf = (GameConfig) obj;
                int i = 3;
                return conf;
            }
        } catch (Exception ex) {
            Logger.getLogger(ConfigManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    /**
     * Restore default <code>gameConfig</code> object from xml file in file system. 
     * @return Previously saved <code>gameConfig</code> object. Or NULL if some problem.
     */
    public GameConfig loadConfig() {
        return loadConfig(OUT_FILE);
    }

    /**
     * @return Default <code>GameConfig</code> object. The object is created with all default values.
     */
    public GameConfig loadDefaultConfig() {
        //TODO implement (same as in Game.init())
        return null;
    }
}
