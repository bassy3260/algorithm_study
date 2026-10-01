import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> s = new Stack<>();
        
        for(int num:arr){
            if(s.isEmpty()){
                s.push(num);
                continue;
            }
            
            if(s.peek() != num){
                s.push(num);
            }
        }
        int[] answer = new int[s.size()];
        for(int i = answer.length-1; i>=0; i--){
            answer[i] = s.pop(); 
        }
       

        return answer;
    }
}