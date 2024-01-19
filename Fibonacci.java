/**
 * The Fibonacci class calculates the "n"th or whatever term of the Fibonacci sequence.
 * @author Rahiem Hylton
 */
public class Fibonacci {

    /**
     * Calculates the "n"th term of the Fibonacci sequence.
     *
     * @param "n" The position of the term to be calculated.
     * @return The Fibonacci value at the "n"th position(10th for this program).
     */
    public static int calcFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }

    /**
     * The main method shows the usage of the Fibonacci class and displays it.
     */
    public static void main(String[] args) {
        int n = 10;
        int ans = calcFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + ans + ".");
    }
}

