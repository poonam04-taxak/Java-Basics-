
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of elements in this line
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                innerList.add(sc.nextInt());
            }
            list.add(innerList);
        }
        
        int q = sc.nextInt(); // number of queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
     sc.close();            
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
