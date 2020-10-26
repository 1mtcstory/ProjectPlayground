// http://web.stanford.edu/class/cs9/sample_probs/TwoSum.pdf
// https://stackoverflow.com/questions/2444019/how-do-i-generate-a-random-integer-between-min-and-max-in-java

import java.util.Arrays;
import java.util.Random;

/**
 * This is a classic algorithmic interview question. There are many different solution routes,
 * each of which involves a different technique. This handout details the problem and gives
 * a few different solution routes.
 * Problem Statement:
 * You are given an array of n integers and a number k. Determine whether there is a pair
 * of elements in the array that sums to exactly k. For example, given the array [1, 3, 7] and
 * k = 8, the answer is “yes,” but given k = 6 the answer is “no.”
 * */

public class T00400_TwoSum {
    public static void main(String[] args) {
        // target variable
        int k;
        int[] ds = new int[5];
        int dsl = ds.length - 1;
        boolean isEqual = false;

        Random rand = new Random();
        int x = 0;
        while (x < ds.length) {
            ds[x] = rand.nextInt(10 + 1 - 0) + 0;
            // System.out.println(Arrays.toString(ds));
            x++;
        }

        k = rand.nextInt(13 + 1 - 5) + 5;
        System.out.println("Find two numbers in this array " + Arrays.toString(ds) + " that equate to the" +
                " target value: " + k + " if possible");

        int c;
        while (isEqual == false) {
            int z = 1;
            for (int y = 0; y < dsl; y++) {
                // System.out.println("y = " + y + " | DS = " + ds[y]);
                for (int a = z; a <= dsl; a++) {
                    // System.out.println("a = " + a + " | DS = " + ds[a]);
                    c = ds[a] + ds[y];
                    if (c == k) {
                        isEqual = true;
                        // System.out.println("Find two numbers in this array " + Arrays.toString(ds) + " that equate to the" +
                        //        " target value: " + k + " if possible");
                        System.out.println("Two sum found!");
                        System.out.println("Position (" + y + "," + a + ")" + " representing values " + ds[y] + " and " + ds[a] + " equals k (" + k + ")\n");
                    } else {
                        if (y == dsl - 1 && a == dsl && c != k && isEqual != true) {
                            //System.out.println("This loop has ended");
                            System.out.println("No two numbers in this array equate to the target value: " + k);
                            isEqual = true;
                        }
                    }
                }
                //System.out.println("----------------------------");
                //System.out.println("Find two numbers in this array " + Arrays.toString(ds) + " that equate to the" +
                //        " target value: " + k + " if possible");
                // System.out.println("----------------------------");
                z++;
            }
        }
    }
}
