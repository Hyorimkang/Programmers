class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int min_index = 0;
        
        //최소값, index 구하기
        for(int i = 0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                min_index = i;
            }
        }
        
        //answer 구현
        for(int i = 0; i<min_index; i++) 
            answer[i] = arr[i];
        for(int i = min_index+1; i<arr.length; i++)
            answer[i-1] = arr[i];
        
        
        
        
        return answer;
    }
}