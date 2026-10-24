import java.util.*;

// 각 칸마다 최소 드는 거리를 보면되는거니까 dp를 일단 써야하나?..
public class Solution {
    public int solution(int n) {
        int ans = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // dp[i] 가 홀수야 그러면 dp[i-1]*2 +1
        // 짝수야 그러면 dp[i-1]*2 
        
        
        while(n!=0){
            if(n%2!=0) ans++; 
            n/=2;
            
        }
     

        return ans;
    }
}