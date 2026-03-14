import java.util.*;
public class DynamicArray {
   
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
         System.out.println("Enter the sizi of array: ");
         int n= s.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
       
        for (int i=0;i<n;i++){
            list.add(s.nextInt());
        }
    
    System.out.println(list);
    }
}


