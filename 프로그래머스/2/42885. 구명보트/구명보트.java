import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        // 일단 정렬해야하지 않겠나.
        Arrays.sort(people);
       
        // 구출하면 1, 안구출하면 0으로 두기
        // 전부 돌았다는걸 어떻게알지
        
        int cnt = 0;
        int end = people.length-1;
        int start =0;
        // 투포인터
        // start가 end보다 작거나 같을 때 까지? 같은거도 ㄱㅊ???
        // 그러면 구했다는걸 어케 알려주지
        // 하나만 구했으면?? 
        while(start<=end){
            // end는 무조건 보트에 탄다.
            cnt++;
            
            // 두개더했는데 리미트보다 커 그러면 end만 구하고 end--
            if(people[start] + people[end] > limit){
                end--;
            }else{
                end--;
                start++;
            }
        }
        
        return cnt;
        // 뒤에서부터 해볼까여 reverse
        
    }
}