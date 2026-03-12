import java.util.Scanner;

public class longestSubarrayWithSumK {
    public static int longestSubarray(int [] arr,int m){
        int sum=0;
        int len=0;
for (int i=0;i<arr.length;i++){
    for (int j=i+1;j<arr.length;j++){
        for (int k=i;k<j;k++){
            sum+=arr[k];
            if (sum==m){
                len=Math.max(len,j-i+1);
             }
            }

        }
        

    }
    return len;
}
public static void main(String [] args){
        Scanner s =new Scanner (System.in);
        int m= s.nextInt();
        int n=s.nextInt();
        int [] arr= new int [n];
        for (int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        System.out.println(longestSubarray(arr,m));
       

    }
    } 
