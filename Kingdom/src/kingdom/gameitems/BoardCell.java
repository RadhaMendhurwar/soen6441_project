package kingdom.gameitems;

import javax.swing.JPanel;

/**
 * Cell on border, may contain the tile or castle
 */
public class BoardCell extends JPanel{
    
    /* hint to shown when mouse-over */
    private String hint;
    /* refference to item placed on the cell (by default is null) */
    private BorderItem item;
    
    public BoardCell(){
        // TODO
    }
    
    public BoardCell(BorderItem item){
        this.item = item;
    }

    public BorderItem getItem() {
        return item;
    }

    public void setItem(BorderItem item) {
        this.item = item;
    }
    
    
    
}
