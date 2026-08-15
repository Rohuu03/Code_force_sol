import java.util.Scanner;
 
public class BeautifulMatrix {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =0;
       int c =0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int x = sc.nextInt();
              if(x==1){
                  r =i;
                  c =j;
              }
            }
        }
        int moves = Math.abs(r-2) + Math.abs(c-2);
        System.out.println(moves);
 
    }
}