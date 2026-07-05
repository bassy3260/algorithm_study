import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T= Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;
        for(int test = 1; test<=T; test++){
            x= 0;
            y= 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // x+y
            int b = Integer.parseInt(st.nextToken()); // x-y
            // x+y 와 x-y 를 더하면  2x다. 그러면 x의 값을 구할 수 있다.

            x = (a+b)/2;
            y = a-x;

            sb.append(x).append(" ").append(y).append("\n");
        }
        System.out.print(sb);
    }
}