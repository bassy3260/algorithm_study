import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> s = new Stack<>();
        
        // 뒤에서부터 읽는다.
        for(int i = numbers.length-1; i>=0; i--){
            int x= numbers[i];
            
            // 스택이 비어있다. -1
            if(s.isEmpty()){
                answer[i] = -1;
            }else if(s.peek() > x){
            // 스택의 peek가 x보다 크다, answer
                answer[i] = s.peek();
            }else{
            // 작다.. 다 빼본다.
                while(!s.isEmpty()){
                    int num = s.pop();
                    
                    if(s.isEmpty()){  
                        answer[i] = -1;
                        break;
                    }else if(s.peek() >x){
                        answer[i] = s.peek();
                        break;
                    }
                }
                
                
            }
            // 스택에 넣는다 후보를.
            s.push(x);
            
        }
        
       
        return answer;
    }
}