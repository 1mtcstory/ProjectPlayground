import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T00200_BlackJack {
    public static void main(String[] args) {
        // sc = score since app started
        // h = current hand
        int sc, set;
        int[] h = new int[21];
        final int limit = 21;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        boolean is21 = false, outcome = false;

        while (!outcome) {
            int total = 0;

            // check array size, add stored numbers
            for (int x = 0; x <= h.length; x++) {
                total = total + h[x];
                int draw = rand.nextInt(12 - 1);
                h[x] = draw;
                System.out.println(draw);

                int ch = total + draw;

                if (ch < limit) {
                    System.out.print("Draw or hold? Press 1 or 2: ");
                    int response = scan.nextInt();
                    System.out.println(Arrays.toString(h));

                    if (response == 1) {
                        outcome = false;
                        System.out.println(" Draw ");
                    } else {
                        System.out.println(" Hold ");
                        outcome = true;
                    }
                    System.out.println(outcome);
                } else {
                    System.out.println("Game over");
                }
            }


        }
    }
}
