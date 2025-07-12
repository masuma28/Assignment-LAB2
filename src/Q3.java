public class Q3 {
    import java.util.*;
    public class Q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), rev = 0, temp = n;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            System.out.println((temp == rev) ? "Palindrome" : "Not palindrome")
        }
    }
