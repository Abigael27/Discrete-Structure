
import java.math.BigInteger;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Discrette2 extends Discretetry {
    
    
 static void with() {
        Scanner ask = new Scanner(System.in);
        System.out.println("\n CHOOSE BELOW: \n 1.PERMUTATION  \n 2.COMBINATION \n");
       
        System.out.print("ENTER YOUR CHOICE NUMBER: ");        
        int choose;
        choose = ask.nextInt();
        
        if(choose==1){
           PERMUTO();
        }
        
        else if(choose==2){
            COMBI();
        }
        
        }
    
    public static void PERMUTO(){
        Scanner pcr = new Scanner(System.in);
        System.out.println("\tPERMUTATION");
        System.out.print("ENTER # N : ");
        BigInteger N = pcr.nextBigInteger();
        int range = 500;
        System.out.print("ENTER # R : ");
        int R = pcr.nextInt();
        
        if ((BigInteger.valueOf(range).compareTo(N)<0)||(R > 500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
                PERMUTO();
            }
        
        else{
        BigInteger result = N.pow(R);
        System.out.println("ANSWER: "+result);
        }
    }
    
    public static void COMBI(){
        Scanner permoto = new Scanner(System.in);
        System.out.println("\tCOMBINATION");
        System.out.print("ENTER # N : ");
        int NNN = permoto.nextInt();
        System.out.print("ENTER # R : ");
        int RRR = permoto.nextInt();
        
        if ((NNN > 500)||(RRR > 500)){
                System.out.println("GREATER THAN 500 IS INVALID");
                COMBI();
                
        }
        else if(NNN<RRR){
            System.out.println("N GREATER THAN R IS INVALID ");
        
            }
        else{
        if(RRR <= NNN){
            int NUM = NNN + (RRR - 1);
            int NUM2 = NUM - RRR;
            
            System.out.println("ANSWER : "+PermuCombiFactorial(NUM,RRR,NUM2));
            
            }
        
            }
    }    
    static BigInteger PermuCombiFactorial(int N, int R, int M){
        BigInteger AAA = new BigInteger("1");
        BigInteger BBB = new BigInteger("1");
        BigInteger CCC = new BigInteger("1");
        BigInteger ANSWER;
        
        for (int i = 2; i <=N; i++) {
            AAA = AAA.multiply(BigInteger.valueOf(i));
            
        }
        for (int y = 2; y <=R; y++) {
            BBB = BBB.multiply(BigInteger.valueOf(y));
            
        }
        for (int x = 2; x <=M; x++) {
            CCC = CCC.multiply(BigInteger.valueOf(x));
            
        }
       
        ANSWER = AAA.divide((BBB.multiply(CCC)));

        return ANSWER;
}}

}
