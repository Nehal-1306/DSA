//import java.util.Scanner;
import java.util.*;
//import java.util.Vector.*;
public class MergeSort {
    void merge(Vector<Integer> arr, int low ,int mid, int high){
        Vector<Integer> temp= new Vector<>();
        int left=low;
        int right=mid+1;
        while((left<=mid)&&(right<=high)){
            if (arr.get(left)<=arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else{
                temp.add(arr.get(right));
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr.get(left));
            left++;
        }
        while(right<=high){
            temp.add(arr.get(right));
            right++;
        }
        for (int i=low;i<=high;i++){
            arr.set(i,temp.get(i-low));
        }
    }
   void mS(Vector<Integer> arr , int low, int high) {
    if (low == high) return;
   int  mid =(low+high)/2;
    mS(arr, low, mid);
    mS(arr, mid+1, high);
    merge(arr, low, mid, high);
   }
   public static void main(String []args){
    Scanner s = new Scanner (System.in);
    int n= s.nextInt();
    Vector <Integer> arr = new Vector<>();
    for (int i=0;i<n;i++){
        arr.add(s.nextInt());
    }
    MergeSort obj= new MergeSort();
    obj.mS(arr, 0, n-1);
    for (int num:arr){
        System.out.print(num +" ");
    }
   }
}
