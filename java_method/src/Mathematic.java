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

    /**
     * <p>
     * This method execute a <strong>sum</strong>
     * </p>
     * 
     * <p>
     * For example:
     * </p>
     * 
     * <code>
     * Mathematic.sum(2, 8)
     * </code>
     * 
     * @param values
     * @see #sum(double ...values)
     */
    public static double sum(double... values) {
        double result = 0;

        for (double value : values) {
            result += value;
        }

        return result;
    }

    /**
     * <p>
     * This method execute a <strong>average</strong>
     * </p>
     * 
     * <p>
     * For example:
     * </p>
     * 
     * <code>
     * Mathematic.average(10, 8, 10)
     * </code>
     * 
     * @param values
     * @see #average(double ...values)
     */
    public static double average(double... values) {
        double result = 0;

        for (double value : values) {
            result += value;
        }

        result /= values.length;

        return result;
    }
}
