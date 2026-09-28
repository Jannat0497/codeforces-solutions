import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split("\\+");
        Arrays.sort(s);
        String result = String.join("+", s);
        System.out.println(result);
    }
}