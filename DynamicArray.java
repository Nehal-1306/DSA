import java.util.*;
 public class DynamicArray {
   
//     public static void main(String[] args) {
//          Scanner s = new Scanner (System.in);
//          System.out.println("Enter the sizi of array: ");
//          int n= s.nextInt();
//         ArrayList<Integer> list= new ArrayList<>();
       
//         for (int i=0;i<n;i++){
//             list.add(s.nextInt());
//         }
    
//     System.out.println(list);
//     }
// }
//just take the size of an array from the user
// multidimentional arraylist
public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    System.out.println("Enter the number: ");
    int n= s.nextInt();
 //initialization
    for (int i=0;i<n;i++){
        list.add(new ArrayList());
    }
 // add elements
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            list.get(i).add(s.nextInt());
        }
    }
    System.out.print(list);
}
 }
