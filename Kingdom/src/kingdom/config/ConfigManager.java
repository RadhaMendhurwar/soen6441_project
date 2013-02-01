/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
 *
 */
public class ConfigManager {

    /**
     * XML file where configuration is saved
     */
    public static final String OUT_FILE = "game_config.xml";

    public boolean saveConfig(GameConfig gameConfig) {
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(gameConfig);
        try {
            String outFilePath = Const.GAME_HOME_FOLDER + OUT_FILE;

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

    public GameConfig loadConfig() {
        Object obj;
        try {
            XStream xstream = new XStream(new DomDriver());
            obj = xstream.fromXML(new File(Const.GAME_HOME_FOLDER + OUT_FILE));

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

    public GameConfig loadDefaultConfig() {

        return null;
    }
}
