class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
        
        for(int i = 1; i<=count; i++){
            result += price * i;
        }
        if(result > money) answer = result - money;
        else if(result <= money) answer = 0;

        return answer;
    }
}