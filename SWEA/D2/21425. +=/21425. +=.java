import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test= Integer.parseInt(br.readLine());

        for(int T = 1; T<= test; T++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            int cnt = 0;
            
            while(num1 <= num3 && num2 <= num3){
                if(num1< num2){
                    num1+=num2;
                }else{
                    num2+=num1;
                }
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
