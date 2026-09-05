//package Q2;
 
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd =0;
            int even1 =0;
            int even2 =0;
            int i =0;
            while(i<n){
                int num = sc.nextInt();
                if(num%2!=0){
                    odd++;
                }
                else if(num%4==0){
                    even1++;
                }
                else{
                    even2++;
                }
                i++;
            }
            int max = Math.max(odd,Math.max(even1,even2));
            System.out.println(max);
        }
    }
}