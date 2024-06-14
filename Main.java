public class Main {
    public static void main(String[] args) {
        int n = 12; // upper limit for the loop
        int counter = 0; // initialize counter to 0

        // Loop to print even numbers from 0 to n
        while (counter <= n) {
            System.out.println(counter); // Print the current value of counter
            counter = counter + 2; // Increment counter by 2
        }
    }
}
