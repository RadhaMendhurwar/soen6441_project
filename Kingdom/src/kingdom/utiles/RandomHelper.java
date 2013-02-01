/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.utiles;

import java.util.List;
import java.util.Random;

/**
 * contains all functionality to work with random numbers
 */
public final class RandomHelper {

    private RandomHelper(){
        // not suppose to be instantiated
    }
    
    /**
     * Generate random number between <code>0</code> ... and <code>max</code>
     * @param max Top limit (Excluded) of number to generate
     * @return random number from range [0...max-1)
     */
    public static int getRandom(int max) {
        Random randGen = new Random();
        return randGen.nextInt(max);
    }

    
    /**
     * Shuffle provided list <b>howManyTimes</b> switches.
     * @param <T> Type of list
     * @param list List to be shuffled
     * @param howManyTimes Number of shuffling in the list
     */
    public static <T> void shuffleList(List<T> list, int howManyTimes) {
        Random randGen = new Random();
        int SIZE = list.size();
        T temp;
        int left;
        int right;

        for (int i = 0; i < howManyTimes; ++i) {
            left = randGen.nextInt(SIZE);
            right = randGen.nextInt(SIZE);
            temp = list.get(left);
            temp = list.set(right, temp);
            list.set(left, temp);
        }
    }
}
