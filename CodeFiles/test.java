package CodeFiles;

import java.util.Scanner;
import CodeFiles.MyClass;

public class test{
    public static void main(String[] arg){
        String s2,s1,s;
        s2="Abhishek is good";
        s1="What about Raju? ";
        int i=20;
        s=s1+"   "+s2+i;
       // System.out.println(s1+s2 +"What about Avisha's age = "+i);
       Scanner myscanner =new Scanner(System.in);
        System.out.println(s);
        MyClass mc=new MyClass();
        mc.i=30;
        mc.printInt();
    }
}
