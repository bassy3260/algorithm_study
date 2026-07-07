import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// 순열, permutation
// 주어진 N개의 숫자중 R개를 이어 고른다.
// 중복을 허용하지 않는다.
// 오름차순 정렬
class Solution {
    static int[] list; // 제시되는 수
    static int[] result; // 결과
    static boolean[] visited; // 방문 표시
    static int N, R; 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine());
            R = 3;
            list = new int[N];
            result = new int[R];
            visited = new boolean[N];
            StringTokenizer st= new StringTokenizer(br.readLine());

            for(int i = 0; i < N; i++){
                list[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println("#" + test_case);
            permutation(0); //0번부터 돈다.
        }
    }

    public static void permutation(int depth){
        if(depth == R){ //depth가 R이면 출력한다.
            for(int a:result){
                System.out.print(a);
            }
            System.out.println();
            return;
        }

        // 0부터 N까지 리스트를 처음부터 돈다..
        for(int i =0; i < N; i++){
            // 재귀 했을 땐 먼저 방문 체크한 수는 넘어가겠지요..
            // 1을 방문 -> 다음엔 1 체크안함. 3 5 7 
            // 3을 방문 -> 다음엔 3 체크안함. 5 7 ..
            if(!visited[i]){ // 방문 체크 
                visited[i] = true; // 먼저 방문 true 변경
                result[depth] = list[i]; // 결과에 추가.
                permutation(depth+1); // 재귀
                visited[i] = false; // 다음 루프를 위해 false처리.
            }
        }
    }
}
