class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int height = 0; // 세로길이 
        int width = 0;
        int sum = 0; // 계산된 brown의 갯수 
        
        while(sum!= brown){
        
             height++; 
             if(yellow%height !=0) continue;
             width = (yellow/height) +2;
             sum = (height*2) + width *2;
             
        // 노랑이 짝수개.. 이러면 계속 /2를 해줘야할듯
        // 로직을 어떻게 세워볼까...
        // height가 1일 때부터 가정
        // width는 (yellow+2) 
        // 일단 조립한다고 생각하고. 
        // 2*height + ((yellow/height)+2)*2 가 brown과 같을 때까지 해야할듯. 
        //그리고 답은 height: height+2 / width: (yellow/height)+2 임..
        }
        answer[0] = width;
        answer[1] = height + 2;
        return answer;
    }
}