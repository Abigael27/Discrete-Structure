

import java.util.Scanner;



public class Discretetry {
     public static void main(String[]args){
       Discrete discrete = new Discrete();
       Discrete2 discrete2 = new Discrete2();
       Discrete3 discrete3 = new Discrete3();
       Discrete4 discrete4 = new Discrete4();
       
       Scanner num = new Scanner(System.in);
       
       System.out.println("[1]--PERMUTATION AND COMBINATION WITHOUT REPITION");
        System.out.println("[2]--PERMUTATION AND COMBINATION WITH REPITION");
        System.out.println("[3]--STIRLING NUMBER SECOND CASE ");
        System.out.println("[4]--PASCAL TRIANGLE ROWS GENERATOR");
        System.out.print("\n ENTER A NUMBER: ");
        
        
        int choose = num.nextInt();
        if(choose==1){
            Discrete.comperm();
        }
        else if (choose==2){
            Discrete2.with();
        }
        else if (choose ==3){
            Discrete3.stir();
        }
        else if (choose ==4){
            Discrete4.P();
        }
     }}
