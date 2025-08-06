public class Program4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print right stars
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
