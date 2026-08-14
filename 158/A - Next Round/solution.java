import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
       
        int n = fs.nextInt();
        int k = fs.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=fs.nextInt();
        }
        int th =arr[k-1];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=th &&arr[i]>0) count++;
        }
        out.print(count);
 
        out.flush();
    }
 
    static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;
 
        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
 
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}