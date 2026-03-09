import java.util.*;
public class MissingNumber {
    public static int missingNumber(int [] arr){
        int n=arr.length+1;
        int expectedSum= n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }
        int missingNumber= expectedSum-actualSum;
        return missingNumber;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n=s.nextInt();
        int [] arr= new int [n];
        for (int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
       System.out.println( "Missing Number: "+missingNumber(arr));
        }

    }
