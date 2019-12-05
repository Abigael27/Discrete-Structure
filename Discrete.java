

import java.math.BigInteger;
import java.util.Scanner;

public class Discrete extends Discrete2 {

static void comperm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n CHOOSE BELOW: \n 1.PERMUTATION  \n 2.COMBINATION \n");
        System.out.print("ENTER YOUR CHOICE NUMBER: ");        
        int choice = sc.nextInt();
 
        if(choice==1){
            System.out.println("\tPERMUTATION");
        System.out.print("ENTER # N : ");
            int N = sc.nextInt();
        System.out.print("ENTER # R : ");
            int R = sc.nextInt();
            
            if((N>500)||(R>500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
            }
            
            else{
            int M = N-R;
            if(N>=R){
            System.out.println("ANSWER: "+ PermuFactorial (N,R,M));
           
            }
 
            else if(N<R){
            System.out.println("N GREATER THAN R IS INVALID ");
          
        }
    }
}
        
        else if(choice==2){
        System.out.println("\tCOMBINATION");
        System.out.print("ENTER # N : ");
        int N = sc.nextInt();
        System.out.print("ENTER # R : ");
        int R = sc.nextInt();
        
        if((N>500)||(R>500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
            }
    
            
        
        else{
        int M = N-R;
        if(N>=R){
            System.out.println("ANSWER: "+ CombiFactorial (N,R,M));
        }
        else if(N<R){
            System.out.println("N GREATER THAN R IS INVALID ");
        }
        }}}
        
 
    static BigInteger PermuFactorial(int N, int R, int M){
        BigInteger AAA = new BigInteger("1");
        BigInteger BBB = new BigInteger("1");
        BigInteger ANSWER;
        
        for (int i = 2; i <=N; i++) {
            AAA = AAA.multiply(BigInteger.valueOf(i));
        }
        for (int x = 2; x <=M; x++) {
            BBB = BBB.multiply(BigInteger.valueOf(x));    
        }
        ANSWER = AAA.divide(BBB);

        return ANSWER;
    }    
    static BigInteger CombiFactorial(int N, int R, int M){
        BigInteger AAA = new BigInteger("1");
        BigInteger CCC = new BigInteger("1");
        BigInteger NUM = new BigInteger("1");
        BigInteger ANSWER;
        
        for (int i = 2; i <=N; i++) {
            AAA = AAA.multiply(BigInteger.valueOf(i));
            
        }
        for (int y = 2; y <=R; y++) {
            CCC = CCC.multiply(BigInteger.valueOf(y));
            
        }
        for (int x = 2; x <=M; x++) {
            NUM = NUM.multiply(BigInteger.valueOf(x));
            
        }
       
        ANSWER = AAA.divide((CCC.multiply(NUM)));

        return ANSWER;
    }
}
