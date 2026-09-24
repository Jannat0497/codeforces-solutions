import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    HashSet<Character> hs= new HashSet<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        hs.add(ch);
    }
    if(hs.size()%2==0) System.out.print("CHAT WITH HER!");
    else System.out.print("IGNORE HIM!");
} 
}