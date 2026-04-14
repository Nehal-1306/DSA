import java.util.*;
public class LinearSearch2D {
   public static void main(String[] args) {
    int [][] arr= {
        {23,1,2},
        {22,5,6},
        {3,56,12,2},
        {18,22}
   } ;
   int target=12;
   int[] ans= search(arr,target);
   System.out.println(Arrays.toString(ans));
   System.out.println(max(arr)); 

}

static int[] search(int [][] arr, int target){
    for (int i=0;i<arr.length;i++){
        for (int j=0;j<arr[i].length;j++){
            if (arr[i][j]==target){
                return new int []{i,j};
            }
        }
    }
    return new int[]{-1,-1};
} 
static int max(int [][]arr){
    int max=Integer.MIN_VALUE;
    for (int []i:arr){
        for (int element:i){
            if (element>max){
            max=element;
            }
        }
    }
    return max;
}
}
