//package Q1;
 
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
           // int mkg = n/k;
            int count =0;
 
            for (int i = 0; i < n; i+=k) {
                boolean flag = false;
                for (int j=i;j<i+k;j++){
                    if(str.charAt(j)=='0'){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    count++;
                }
            }
            System.out.println(count);
        }
 
    }
}