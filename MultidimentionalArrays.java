import java.util.*;
public class MultidimentionalArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int [][] arr= new int[n][m];

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=s.nextInt();
        }
    }
  for (int i=0;i<arr.length;i++){
           
            System.out.print(Arrays.toString(arr[i]));
}
System.out.println();
}
    }


