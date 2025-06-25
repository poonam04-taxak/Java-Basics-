 class deletion_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int size=5;
        int indextodelete = 2;

        //show original array

        System.out.println("your elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //shift ele form left to indextodelete
        

        for(int i=indextodelete;i<size-1;i++){
            arr[i] = arr[i]+1;
        }
      size--;
      //"move elements in place of deleted:

      System.out.println("show updated array after deletion:");
      for(int i=0;i<size;i++){
        System.out.println(arr[i]);
      }

    }
}
