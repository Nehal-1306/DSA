
   import java.util.*;
public class SelectionSort{
    public static void selectionSort(int [] arr,int n){
           for (int i=0;i<n-1;i++){
             int minIndex=i;
             for(int j=i+1;j<n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
}
}
int temp =arr[i];
arr[i]=arr[minIndex];
arr[minIndex]=temp;
        }
    }
    public static void main(String[] args){
Scanner s=new Scanner (System.in);
int n= s.nextInt();
int []arr=new int[n];
for (int i=0;i<n;i++){
 arr[i]= s.nextInt();
}
selectionSort(arr, n);
System.out.println(Arrays.toString(arr));
    }
} 

