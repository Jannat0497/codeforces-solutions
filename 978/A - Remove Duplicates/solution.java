import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    
    HashSet<Integer> hs= new HashSet<>();
    Stack<Integer> st= new Stack<>();
    
    for(int i=n-1;i>=0;i--){
        if(!hs.contains(arr[i])) {
            hs.add(arr[i]);
            st.push(arr[i]);
        }
    }
    System.out.println(st.size());
    while (!st.isEmpty()) {
        System.out.print(st.pop());
        if (!st.isEmpty()) {
            System.out.print(" ");
        }
    }
    
} 
}