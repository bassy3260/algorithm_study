import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 해시맵으로 값 세기
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int item:tangerine){
            map.put(item, map.getOrDefault(item,0)+1);
        }
        
       
        ArrayList<Integer> list = new ArrayList<>(map.values());
        
        list.sort(Collections.reverseOrder());
        
        int cnt = 0;
        int sum = 0;
        for(int item:list){
            
            sum+=item;
            cnt++;
            if(sum>=k){
                break;
            }
            
        }
        
        
        return cnt;
    }
}