
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Discrete3 extends Discrette2 {
 

  
    static BigInteger Combination(int n,int k){
        if(n>k){
            BigInteger a = BigInteger.valueOf(-1);
            return a;
        }
        else if(n==k){
            BigInteger b = BigInteger.valueOf(1);
            return b;
        }
        else if (k == 0){
            BigInteger c = BigInteger.valueOf(1);
            return c;
        }
        else{
            return Combination(n-1,k-1).add(Combination(n-1,k));
        }}
    static BigInteger stirlingNum(int k , int n){
        if(n>k){
            BigInteger a = BigInteger.valueOf(-1);
            return a;
        }
        else if (n==0){
            BigInteger b = BigInteger.valueOf(0);
            return b;
        }
        else if (k==n){
            BigInteger c = BigInteger.valueOf(1);
            return c;
        }
        else if (n==1){
            return factorial(k-1);
        }
        else if(k-n == 1){
            return Combination(k,2);
        }
        else{
            BigInteger d = stirlingNum(k-1,n-1);
            BigInteger e = stirlingNum(k-1,n);
            BigInteger f = BigInteger.valueOf(k-1);
            return (d.add(f)).multiply(e);
        }}
 
   static void stir(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'n' : ");
        int n = sc.nextInt();
        System.out.print("Enter value of 'k' : ");
        int k = sc.nextInt();
        
        if ((n>500)||(k>500)){
            System.out.println("INVALID INPUT");
            
               }
   
        else {
            System.out.print("Answer: ");
            
            BigInteger s1 = BigInteger.valueOf(-1);
        BigInteger s2 = BigInteger.valueOf(-1);
        
        BigInteger snj = BigInteger.ZERO;
        BigInteger snj1 = BigInteger.ZERO;
        BigInteger fin = BigInteger.ZERO;
            for(int i = 0; i < k; i++){
            s1 = (s1).multiply(s2);
            BigInteger combi = factorial(k).divide(factorial(i).multiply(factorial(k-i)));
            snj = BigInteger.valueOf(k).subtract(BigInteger.valueOf(i));
            snj1 = BigInteger.valueOf(k).subtract(BigInteger.valueOf(i));
                for(int a = 1; a < n; a++){
                snj = snj.multiply(snj1);
                }
                fin = fin.add((s1).multiply(combi).multiply(snj));
            }
        System.out.println(fin.divide(factorial(k)));
        }
    }
       static BigInteger factorial(int n){
        BigInteger factor = new BigInteger("1");
        for(int b = 2; b < n; b++){
            factor = factor.multiply(BigInteger.valueOf(b));
        }
        return factor;
    }
}
    
}

}
