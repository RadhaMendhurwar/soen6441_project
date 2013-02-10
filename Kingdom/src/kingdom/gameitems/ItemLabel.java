/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * Same as normal JLabel, but contains object (BoardItem) that the label represents
 */
public class ItemLabel extends JLabel{
    
    
    private BorderItem item = null;

    public ItemLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public ItemLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public ItemLabel(String text) {
        super(text);
    }

    public ItemLabel(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public ItemLabel(Icon image) {
        super(image);
    }

    public ItemLabel() {
    }
    
    public BorderItem getItem() {
        return item;
    }

    public void setItem(BorderItem item) {
        this.item = item;
    }
    
    
}
