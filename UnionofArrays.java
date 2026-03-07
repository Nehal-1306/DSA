import java.util.Scanner;
import java.util.*;
public class UnionofArrays {
    public static  void unionOfArrays(int [] arr1,int [] arr2){
        HashSet <Integer> set= new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
           
        }
        for (int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
           
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int [] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        int [] arr2= new int[m];
        
        for(int j=0;j<m;j++){
            arr2[j]=s.nextInt();

        }
        unionOfArrays(arr1,arr2);


    }
}
