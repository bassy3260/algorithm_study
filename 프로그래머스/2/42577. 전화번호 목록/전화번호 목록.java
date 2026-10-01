import java.util.*;
class Solution {
    // 해시...에다가 하나씩 저장..
    // 앞에가 포함되는지 확인을 해야하나
    // 앞에가 포함되는지를 어떻게 확인함?
    // value가 앞에 :value.length만큼 같은지 확인? 
    // 모든 해시를 다 확인?이 아니고 내 번호만 확인한다.
    // 앞부분을 잘라서 해시에 있는지 확인한다. 
    // 모든 번호를 HashSet<String> 에 넣는다.
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        for(String phone:phone_book){
            set.add(phone);
        }
        
        for(String phone: phone_book){
            if(answer == false){
                break;
            }
            for(int i=1; i<phone.length(); i++){
                if(set.contains(phone.substring(0,i))){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}