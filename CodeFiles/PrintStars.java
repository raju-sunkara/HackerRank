package CodeFiles;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] s){

        System.out.println("Enter number of lines to print");
        Scanner sc=new Scanner(System.in);
        int lines = sc.nextInt();
        int it=0;
        for(int l=0;l<lines;l++){//to print lines
            System.out.print(l+ " "+it);
            for(it=0;it<lines-l;it++){
                System.out.print(" ");
            }
            for(it=l;it<lines;it++){
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
    
}
