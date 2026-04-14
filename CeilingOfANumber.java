import java.util.*;
public class CeilingOfANumber {
    public static int search(int []arr,int target){
        int low=0;
        int high=arr.length-1;
      
        while(low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                return arr[mid]; 
            }
            else if (target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
       int [] arr={3,5,9,14,16,18};
       int target=15;
       System.out.println(search(arr,target));
       

    }
    
}


