import java.util.*;
public class IsArmstrong {
    static boolean isArmstrong(int n){
    
        int original=n;
        int sum=0;
        while(n>0){
            int a=n%10;
            n=n/10;
            sum+=a*a*a;
        }
        if (sum==original){
            return true;
        }
        else return false;
        
    }

        public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            System.out.println("Enter the Number: ");
            int n= s.nextInt();
            System.out.println(isArmstrong(n));

        }

    }

