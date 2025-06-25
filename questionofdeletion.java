import java.util.Scanner;
public class questionofdeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size =sc.nextInt();

        int[] arr = new int[size];
        System.out.println("elements are:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

System.out.println("enter which ele you want to delete:");
int indextodelete = sc.nextInt();

//check ele is present or not
if(indextodelete<0 || indextodelete>=size){
    System.out.println("invalid input");
}
else{
    //shift ele
    for(int i=indextodelete;i<size-1;i++){
        arr[i]=arr[i]+1;

    }
    size--;
    //print updated array
    System.out.println("updated array is:");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
}
sc.close();
    }
}
