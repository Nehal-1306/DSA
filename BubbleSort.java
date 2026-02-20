import java.util.Scanner;
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int [] arr, int n){
        for (int i=n-1;i>=0;i--){
            int didSwap=0;;
            for (int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;

                }
            }
            if (didSwap==0){
                 break;
            }
                 System.out.println("Run");
            
        }

    }
    public static void main(String [] args){
        Scanner s =new Scanner (System.in);
        int n=s.nextInt();
        int [] arr= new int [n];
        for (int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        bubbleSort(arr,n);
System.out.println(Arrays.toString(arr));
        }
}
