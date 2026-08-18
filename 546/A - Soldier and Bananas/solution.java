//package SoldierAndBanana;
 
import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n  = sc.nextInt();
        int w = sc.nextInt();
        int total =0;
        total = k*(w*(w+1))/2;
        int op = Math.max(total-n,0) ;
        System.out.println(op);
    }
}