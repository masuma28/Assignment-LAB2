import java.util.Scanner;
    public class Q4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] distinct = new int[10];
            int count = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                boolean found = false;
                for (int j = 0; j < count; j++)
                    if (distinct[j] == num) found = true;
                if (!found) distinct[count++] = num;
            }
            System.out.print("Distinct: ");
            for (int i = 0; i < count; i++) System.out.print(distinct[i] + " ");
        }
    }

