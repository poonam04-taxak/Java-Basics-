
public class traversal_in_array {
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        //Scanner sc= new Scanner(System.in);
        //using for loop traverse the elements
      /*   System.out.println("traverse elements using for loop:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        
sc.close();
    }
    
}*/



// traverse elements using for each loop

/*System.out.println("traverse elements using for each loop:");
for(int element : arr){
    System.out.println(element + " ");
}
}
}*/



//using while loop

System.out.println("traverse elements using while loop:");
int i=0;
while(i<arr.length){
    System.out.println(arr[i] + " ");
    i++;
}

    }
}