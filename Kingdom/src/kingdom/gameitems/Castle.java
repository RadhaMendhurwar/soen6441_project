package kingdom.gameitems;

import kingdom.gameitems.Const.UserColor;

/**
 * Represent an Castle on GameBoard
 */
public class Castle extends BoardItem {
    
    /* rank of castle 1-4 */
    private int rank;
    
    /* color of castle */
    private UserColor color;
    
    public Castle(UserColor color){
        this.color = color;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public UserColor getColor() {
        return color;
    }

    public void setColor(UserColor color) {
        this.color = color;
    }
    
    
}
