public class Fibonacci
{
    public static int calcFibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        else {
            return calcFibonacci (n - 1) + calcFibonacci (n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = calcFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + ans + ".");
    }
}