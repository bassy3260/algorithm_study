class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
       
        int n = schedules.length;
        startday--;
        
        int answer = 0;
        for(int i = 0; i<schedules.length; i++){
            int limit = (schedules[i]+10)%100 >=60 ? schedules[i]+50 :schedules[i]+ 10; 
            for(int j = 0; j<7; j++){
                if((startday+ j) %7 == 5 || (startday+j) %7 == 6) continue;
                if(timelogs[i][j] > limit){
                    n--;
                    break;
                }
            }        
        }
        return n;
    }
}