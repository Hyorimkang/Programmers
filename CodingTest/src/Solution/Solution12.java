package Solution;

public class Solution12 {
	public boolean solution(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        String arr[] = num.split("");
        int arr_[] = new int[arr.length];
        int result = 0;
        
        for(int i =0; i<arr.length; i++){
            arr_[i] = Integer.parseInt(arr[i]);
            result += arr_[i];
            if(x%result==0){
                answer = true;
            }
            else{
                answer = false;
            }
        }
        return answer;
    }
}
