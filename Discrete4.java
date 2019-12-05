import java.math.BigInteger;
import java.util.Scanner;


class Discrete4 {
    
    static void P(){
    Scanner sc = new Scanner(System.in);
          System.out.print("Enter number of row: ");
          int num = sc.nextInt();
    
    
        if(num>=500){
            System.out.println("INVALID INPUT");
        }
        else {
            System.out.println("Answer: ");
            BigInteger[] ans = comp(num);
            for(BigInteger r: ans){
                System.out.print(r+"");
            }}
    }
     private static BigInteger[] comp(int num) {
       BigInteger var = new BigInteger("1");
       BigInteger var1 = new BigInteger("1");
        
        BigInteger[] previous = {var,var1};
        for (int r= 0; r <= num; r++){
            BigInteger[] next = new BigInteger[r+1];
            next[0] = var;
            for (int i = 1; i < r; i++){
                next [i] = previous [ i -1 ].add(previous[i]);
            }
            next[r] = var;
            previous = next;
        }
        return previous;
     }    
       }
        