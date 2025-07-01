import java.util.*;
public class RemoveDuplicatesSortedArray {
    public static int remove(int[]arr){
        if(arr.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter your ele:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            // Sort in case input is unsorted
//Arrays.sort(arr);
        }
        sc.close();
        int length=remove(arr);
        System.out.println("length of array after remove duplicates "+length);
        System.out.println("array after remove duplicates: ");
        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
