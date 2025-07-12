import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (scores[i] < scores[j]) {
                    int t = scores[i];
                    scores[i] = scores[j];
                    scores[j] = t;
                    String s = names[i];
                    names[i] = names[j];
                    names[j] = s;
                }
        for (int i = 0; i < n; i++)
            System.out.println(names[i] + ": " + scores[i]);
    }
}
