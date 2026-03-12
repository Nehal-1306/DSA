import java.util.*;
public class IsPrime {
    static boolean isPrime(int n){
        if (n<=1) return false;
        int i=2;
        while(i*i<=n){
            if (n%i==0){
                return false;
            }
            i++;
      }
      return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
          System.out.println( isPrime(n));

    }
}
