/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.utiles;

/**
 * Implementation has to implement single method to move some amount of money from source to destination.
 * Money for user are stored in array int[c1, c5, c10, c50, c100]
 * @author andriy
 */
public interface IMoneyManager {
    
    
    /**
     * index of one coins in array
     */
    public static final int c1 = 0;
    /**
     * index of five coins in array
     */
    public static final int c5 = 1;
    /**
     * index of ten coins in array
     */
    public static final int c10 = 2;
    /**
     * index of fifty coins in array
     */
    public static final int c50 = 3;
    /**
     * index of hundred coins in array
     */
    public static final int c100 = 4;
    /**
     * index of one coins in array
     */
    public enum OperationStatus{
        SUCCESS, 
        TO_LITTLE_SOURCE,
        NO_CHANGE,
        UNKNOWN
    }
    
    public OperationStatus moveMoney(int[] source, int[] destination, int howMany);
}
