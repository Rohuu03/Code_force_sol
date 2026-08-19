//package DayAtTheBeach;
 
import java.util.Scanner;
 
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        // prefix
        int left[] = new int[n];
        left[0] = nums[0];
        for(int i=1;i<n;i++){
            left[i] =Math.max(left[i-1],nums[i]);
        }
        //suffix
         int right[] = new int[n];
        right[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.min(right[i+1],nums[i]);
        }
        int count =1;
        for(int i=0;i<n-1;i++){
            if(left[i]<=right[i+1]){
                count++;
            }
        }
         System.out.println(count);
    }
}