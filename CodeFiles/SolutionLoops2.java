package CodeFiles;
/*
*/
import java.util.*;
//import java.io.*;
import java.lang.Math;

class SolutionLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if ((0<=t && t<=500)&&((0<=a && a<=50)&&(0<=b && b<=50))&&(1<=n && n<=15)){ // Boundary check
                double sum=a;
                for(int j=0;j<n;j++){
                    sum=sum+(b*Math.pow(2,j));
                    System.out.print(String.format("%1.0f ", sum));
                }
                System.out.println("");
            }    
        }

       
        in.close();
    }
}


