/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.utiles;

import java.awt.Component;
import java.awt.event.MouseEvent;
import kingdom.gameitems.BoardCell;
import kingdom.gameitems.BorderItem;
import kingdom.gameitems.Const;
import kingdom.gameitems.Game;
import kingdom.gameitems.ItemLabel;
import kingdom.gameitems.Tile;

/**
 *
 * @author andriy
 */
public class ListenerHelper {

    public static void addTileLabelListeners(final ItemLabel tempLabel) {
        
        if(tempLabel == null){
            return;
        }
        
        tempLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                super.mouseEntered(evt);
                tempLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 0)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                tempLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Const.BG_DEFAULT_COLOR));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemLabel itLabel = null;
                Component comp = evt.getComponent();
                if(comp instanceof ItemLabel){
                    itLabel = (ItemLabel)comp;
                }
                if(itLabel != null){
                    if(Game.getInstance().setSelectedTile(itLabel)){
                        tempLabel.setIcon(itLabel.getItem().getBigImage());
                    }
                }
            }
        });
        
    }
    
}
