class Solution {
    public int[] solution(String s) {
        

        // while문 돌면서
        // 0을 포함할때만
        int count = 0;
        int zero_count = 0;
        while(!s.equals("1")){
            count++;
            zero_count += s.length() - s.replace("0","").length();
            s = s.replace("0","");
            int length = s.length();
            
            StringBuilder temp = new StringBuilder();
            // 2진수 어떻게 만듭니까
            // 일단 2로 나눠봐.. 그러면 1을 추가합니다
            // 그다음부터는
            // 2로 나눴을 때 나누어 떨어집니다  ==> 0추가
            while(length>0){
                int namuzi = length%2;
                temp = temp.insert(0,namuzi);
                length=length/2;
            }
            s= temp.toString();
        }
        int[] answer = {count, zero_count};
        return answer;
    }
}