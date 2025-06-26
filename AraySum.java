import java.util.*;
public class AraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int[]arr=new int[n];

        //input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //calc sum
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("sum is: "+sum);
        sc.close();
    }
    
}
