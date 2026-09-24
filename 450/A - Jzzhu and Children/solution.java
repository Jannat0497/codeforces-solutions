import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int candy=sc.nextInt();
    int[] arr= new int[n];
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        q.add(i+1);
    }
    int last=n;
    while(!q.isEmpty()){
        int ele=q.poll();
        last=ele;
        if(arr[ele-1]>candy){
            arr[ele-1]-=candy;
            q.add(ele);
        }
    }
    System.out.print(last);
    } 
}