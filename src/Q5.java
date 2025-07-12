//
import java.util.Random;
public class Q5 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) a[i] = r.nextInt(1000);
        int max = 0, min = 0;
        for (int i = 1; i < 100; i++) {
            if (a[i] > a[max]) max = i;
            if (a[i] < a[min]) min = i;
        }
        System.out.println("Max: " + a[max] + " at " + max);
        System.out.println("Min: " + a[min] + "at" + min);
    }
}