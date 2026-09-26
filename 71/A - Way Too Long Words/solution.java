import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            String str = sc.next();
 
            if (str.length() <= 10) {
                System.out.println(str);
            } else {
                char f = str.charAt(0);
                char l = str.charAt(str.length() - 1);
                int len = str.length() - 2;
 
                System.out.println("" + f + len + l);
            }
        }
    }
}