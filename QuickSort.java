import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
   static void quickSort(int []arr, int low ,int high){

    // base case
if (low>=high) return;

//partition
int  p= partition( arr,low,high);

//left part sorting
quickSort(arr, low, p-1);

//right part sorting
quickSort(arr,p+1,high);
   }  

 static int partition(int [] arr,int low, int high ){
int pivot=arr[low];
int cnt=0;
for (int i=low+1;i<=high;i++){
    if(arr[i]<=pivot){
   cnt++;
    }
   }
    int pivotIndex= low+cnt;
    int temp=arr[low];
    arr[low]=arr[pivotIndex];
    arr[pivotIndex]=temp;
    
    int i=low,j=high;
    while(i<pivotIndex && j>pivotIndex){
      while (arr[i]<pivot){
         i++;
      }
      while(arr[j]>pivot){
         j--;
      }
      if (i<pivotIndex && j>pivotIndex){
         int temp2=arr[i];
         arr[i]=arr[j];
         arr[j]=temp2;
         i++;
         j--;
      }

    }
    return pivotIndex;
}
   public static void main(String [] args){
     Scanner s =new Scanner (System.in);
        int n=s.nextInt();
        int [] arr= new int [n];
        for (int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        quickSort(arr,0,n-1);
System.out.println(Arrays.toString(arr));
        
   }
}
