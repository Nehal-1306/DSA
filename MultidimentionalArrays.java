// import java.util.*;
// public class MultidimentionalArrays {
//     public static void main(String[] args) {
//         Scanner s = new Scanner (System.in);
//         int n=s.nextInt();
//         int m=s.nextInt();
//         int [][] arr= new int[n][m];

//         for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//             arr[i][j]=s.nextInt();
//         }
//     }
//   for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//             System.out.print((arr[i][j]+" "));
// }
// System.out.println();
// }
//     }
// }
//or
import java.util.*;

public class MultidimentionalArrays {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();  // rows
        int m = s.nextInt();  // columns

        int[][] arr = new int[n][m];

        // input
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = s.nextInt();
            }
        }

        // printing matrix using Arrays
        for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
