public class LeaderOfAnArray(int [] arr) {
    int n=arr.length;
    int p=0;
    int []res= new int [n];
    for(int i=p+1;i<n;i++){
        if (arr[i]>arr[p])
            p++;
    }
}
