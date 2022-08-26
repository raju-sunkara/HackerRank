package CodeFiles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionEOF{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        String lines="";
        int count=1;
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            lines=lines+count + " "+line+ "\n";
            count++;    
        }
        System.out.println("Ourlines = "+ lines);
    }
}
