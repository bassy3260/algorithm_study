// 슬라이딩 윈도우일까 투포인터일까
// 투포인터죠

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 배열에 숫자를 받으면 배열에 1부터 n 까지 들어가게하자. 

        //start를 정의하자. 0부터
        int start = 1;
        // end를 정의하자 0부터
        int end = 1;
        int sum = 1;
        while(start<=n){
            // start부터 end까지 더한게 작으면.. end++ 
            if(sum<n){
                end++;
                sum+=end;
            }else if(sum>n){
            // start부터 end까지 더한게 크면.. start-
                sum-=start;
                start++;         
            }else{
                // 해당 숫자면.. cnt++
                answer++;
                // 하고 start++
                sum-=start;               
                start++;
               
            }
        }
        return answer;
    }
}