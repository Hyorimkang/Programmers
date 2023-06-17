package Solution;

import java.util.Arrays;

public class Solution14 {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int cnt=0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }
        
        if(cnt>=1){
            answer = new int[cnt];
        }
        else{
            return answer;
        }
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[cnt-1] = arr[i];
                cnt--;
            }   
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
