class Solution {
    public int[] solution(int[] sequence, int k) {
        // 부분 수열이 가장 짧은걸 찾아야한다.
        // 그러면 뒤에서부터 시작하는게 이득이다.
        // 부분 수열이 여러개면 앞쪽에 나오는걸 찾아야한다.
        // 그러면 앞에서도 찾아야한다.
        // 속도면에서야 뒤에서 찾는게 이득이긴한데 앞쪽에 나오는게 진짜 답이니 앞쪽부터 일단 찾아보는게 낫다.
        
        // 그럼 쌍을 저장하는게 좋은가.
        // 길이를 기록해야한다.
        // 최소길이, 최소길이일때 시작 지점, 최소길이일때 마지막 지점을 기록한다?
        // 완전 그리디수준? 
        
        int minLength = Integer.MAX_VALUE;
        int minstart = 0;
        int minend = 1;
        
        // 진짜 움직이는 포인터.
        int start = 0;
        int windowSum = 0;
        for(int end = 0; end<sequence.length; end++){
            // 일단 처음 더하고
            windowSum+=sequence[end];
           
            // k보다 클 때 까지.
            // while안에서는 합이 너무 크다는 상황뿐이다.
            // start 를 옮겨서 합을 줄여야한다.
            while(windowSum>k){
                
            
                    windowSum -= sequence[start];
                    start++;  
                
            }   
            if(windowSum == k){
                if(minLength > end-start+1){
                    minLength = end-start+1;
                    minstart = start;
                    minend = end;
                }
                   
            }
        }
        int[] answer = {minstart, minend};
        
        return answer;
    }
}