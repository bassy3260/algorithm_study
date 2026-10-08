class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 이진수로 변환 했을 때 1의 갯수가 같다.
        
        
        // 가장 간단한거: 2진수로 하나하나씩 변환하고 1의 갯수를 비교한다.
        // 속도가 느리진 않나.
        // 1씩 증가 시키면서 1의 갯수를 비교하기.
        int nCnt = getOne(n);
        while(true)
        {
            if(nCnt == getOne(++n)){
                answer = n;
                break;
            }
            
        }        
        return answer;
    }
    
    // 2진수로 변환하고 1의 갯수를 반환하는 함수
    public int getOne(int num){
       String b1 = Integer.toBinaryString(num);
        int cnt = 0;
        for(int i = 0; i<b1.length();i++){
            if(b1.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}