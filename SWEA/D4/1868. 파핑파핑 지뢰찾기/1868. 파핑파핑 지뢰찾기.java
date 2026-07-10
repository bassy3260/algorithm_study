import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    static int n;
    static char[][] arr;
    static boolean[][] visited;
    static int[][] mineCount;
    // 8방 탐색.
    static int[] dr = {0,1,1,1,0,-1,-1,-1};
    static int[] dc = {1,1,0,-1,-1,-1,0,1};

    static class Pos{
        int r;
        int c;

        Pos(int r,int c){
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
       
        for(int test = 1; test<=T; test++){
            n = Integer.parseInt(br.readLine());
            arr = new char[n][n];
            
            // 입력받기 
            // '*'이면 지뢰가 있다는 뜻이고, '.'이면 지뢰가 없다는 뜻이다.
            for(int i = 0; i<n; i++){
                String str = br.readLine();
                arr[i] = str.toCharArray();
            }

            countMines();
            visited = new boolean[n][n];

            int cnt = 0;
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(arr[i][j] == '.' && !visited[i][j] && mineCount[i][j] == 0){
                        bfs(i, j);
                        cnt++;
                    }
                }
            }

            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(arr[i][j] == '.' && !visited[i][j]){
                        visited[i][j] = true;
                        cnt++;
                    }
                }
            }
            
            sb.append("#").append(test).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    static void bfs(int r, int c){
        Queue<Pos> q= new LinkedList<>();

        q.add(new Pos(r,c));
        visited[r][c] =true;

        while(!q.isEmpty()){
            Pos node = q.poll();
            int cnt = 0;
            // 8방 탐색 
            for(int j = 0; j<8; j++){
                int nr = node.r+dr[j];
                int nc = node.c+dc[j];

                //그 칸이 "숫자 칸"(주변 지뢰 개수 > 0)이라면?
                // 그 칸이 "빈 칸"(주변 지뢰 개수 == 0)이라면?
                if(nr <0 || nc< 0 || nr>=n || nc>=n)
                    continue;
                if(arr[nr][nc] == '*') continue;
                if(visited[nr][nc] == true)
                    continue;
                if(mineCount[nr][nc] ==0){
                    q.add(new Pos(nr,nc));
                    visited[nr][nc] = true;
                }else{
                   visited[nr][nc] = true;   
                }
            }
        }
    }

    // 주변 지뢰 먼저 다 세기
    static void countMines(){
        mineCount = new int[n][n];
        for (int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] == '*') continue;

                int count = 0;
                for(int k = 0; k<8; k++){
                    int ni = i +dr[k];
                    int nj = j +dc[k];

                    if(ni <0 || nj< 0 || ni>=n || nj>=n)
                        continue;
                    if(arr[ni][nj] != '*') continue;

                    count++;
                }
                mineCount[i][j] = count;
            }
        }
    }
}
