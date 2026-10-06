import java.util.*;

// 스택!!
class Solution
{
    public int solution(String r)
    {
        int answer = -1;

        Stack<Character> s = new Stack<>();
        
        char[] arr= r.toCharArray();
        
        for(char c: arr){
            if(s.isEmpty()){
                s.push(c);
                continue;
            }
            if(s.peek() == c){
                s.pop();
                continue;
            }
            
            s.push(c);
            
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        if(s.isEmpty()) answer =1;
        else answer =0;
        return answer;
    }
}