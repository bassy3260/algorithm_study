import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int test = 1; test<=T; test++){
            int num = Integer.parseInt(br.readLine());

            int[] score = new int[101];
            int max= 0;
            int maxpos =0;

            StringTokenizer st= new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String str = st.nextToken();
                int now = Integer.parseInt(str);
                score[now]++;
                if(max<=score[now]){
                    max= score[now];
                    maxpos = now;
                }
            }
            sb.append("#").append(num).append(" ").append(maxpos).append("\n");
        }
        System.out.print(sb);
    }
}
