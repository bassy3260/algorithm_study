import java.util.*;

class Solution {
    static int[] dp;
    public long solution(int target) {
        dp = new int[target+1];

        // dp...를 어떻게하지??..
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=target;i++){
           
            dp[i] = (dp[i-1]+dp[i-2])%1234567;
        }
        return dp[target];
    }
    
}