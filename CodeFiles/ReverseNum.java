package CodeFiles;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String a[]){
        int n,d=0,rn=0;
        System.out.println("Enter a number to print in reverse order: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        //Logic 
        while(n!=0){
            d=n%10;
            n=n/10;
            rn=rn*10+d;
        }
        System.out.println("Reversed number is: "+rn);
    }
    
}
