package CodeFiles;
/*
 * 
 * THis program prints 1-10 numbers...
 */
public class TestPrintNumbers {
    public static void main(String[] s){

        /* System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7"); */
        
        for(int i=-100;i<100;i++){
            //Write your repeatable code
            // if (i>30 && i<60){
            //     System.out.print ("-");
            //     continue;
            // }
            float value=0;
            try{ 
                value=200/i;
              
            }catch(Exception e){
                System.out.println("devide by zero canot be defined... ");
                e.printStackTrace();
            }
           
            System.out.println("i = "+i+"  value="+value);
        }

    }
    
}
