/**
 * @author João Gabriel Valentim Theodoro
 * 
 *         <p>
 *         This class is a fork of <strong>Math</strong>
 *         </p>
 */
public class Mathematic {
    /**
     * This is a const to PI value
     */
    static final double PI = 3.141592653589793;

    /**
     * <p>
     * This method execute a <strong>power</strong>
     * </p>
     * 
     * <p>
     * For example:
     * </p>
     * 
     * <code>
     * Mathematic.pow(2, 8)
     * </code>
     * 
     * @param value
     * @param valueElevated
     * @see #pow(double value, double valueElevated)
     */
    static double pow(double value, double valueElevated) {
        if (value == 0 || valueElevated == 0) {
            return 1;
        }

        for (int i = 1; i < valueElevated; i++) {
            value += value;
        }
        return value;
    }
}
