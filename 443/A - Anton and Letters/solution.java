import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    HashSet<Character> hs= new HashSet<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isLetter(ch)) hs.add(ch);
    }
    System.out.print(hs.size());
    } 
}