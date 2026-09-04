import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] carr = s.toCharArray();
        
        Stack stack = new Stack<>();
        
        for(int i = 0;i<carr.length;i++){
            char now = carr[i];
            // ) 만나면 무조건 pop 하면되는가?
            // 지금 (이면 push 하면 될듯
            if(now=='('){
               stack.push(now);
            }
            // 지금 )인데 비어있으면 답이 false
            else{
                if(stack.isEmpty()){
                    answer=false;
                    break;
                }
                stack.pop();
            }        
        }
        if(!stack.isEmpty()){
            return false;
        }
        

        return answer;
    }
}