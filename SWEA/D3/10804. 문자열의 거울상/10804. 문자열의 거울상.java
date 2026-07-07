import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int test = 1; test<=T; test++){
            String input = br.readLine();
            char[] arr= input.toCharArray();
            sb.append("#").append(test).append(" ");
            for(int i = arr.length-1; i>=0; i-- ){
                switch(arr[i]){
                    case 'b':
                        sb.append('d');
                        break;
                    case 'd':
                        sb.append('b');
                        break;
                    case 'q':
                        sb.append('p');
                        break;
                    case 'p':
                        sb.append('q');
                        break;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
