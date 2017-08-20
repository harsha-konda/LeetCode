package strings;

public class Pow {
    public static void main(String[] args) {
        System.out.println((new Pow()).myPow(1.00001, 123456));
    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        return n < 0 ? 1.0 / x * myPow(x, n + 1) : x * myPow(x, n - 1);

    }
}
