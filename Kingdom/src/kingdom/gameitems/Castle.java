/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

import kingdom.gameitems.Const.UserColor;

/**
 * Represent an Castle on the GameBoard
 */
public class Castle extends BorderItem {
    
    /* rank of castle 1-4 */
    private int rank;
    /* color of castle */
    private UserColor color;
    
    /**
     * @param color users color (use constant from {@link UserColor})
     * @param rank rank of castle (may be 1 .. 6)
     */
    public Castle(UserColor color, int rank){
        super("" + color + " R" + rank);
        this.color = color;
        this.rank = rank;
    }

    /**
     *
     * @return  rank of castle (may be 1 .. 6)
     */
    public int getRank() {
        return rank;
    }

    /**
     *
     * @param rank  rank of castle (may be 1 .. 6)
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     *
     * @return  users color (use constant from {@link UserColor})
     */
    public UserColor getColor() {
        return color;
    }

    /**
     *
     * @param color  users color (use constant from {@link UserColor})
     */
    public void setColor(UserColor color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return String.valueOf(color) + "[" + rank + "]";
    }
    
}
