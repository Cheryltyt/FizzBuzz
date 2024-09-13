public class Reduce {

    public static void main(String[] args) {
        int n = 100;
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2; // Divide by 2 if even
            } else {
                n -= 1; // Subtract 1 if odd
            }
            steps++;
        }

        System.out.println("Steps to reach 0 from 100: " + steps);
    }
}
