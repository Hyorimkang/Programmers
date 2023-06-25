package Solution;

public class Solution18 {
	public int solution(long num) {
        int answer = 0;
        
        do{
            if(num==1){
                return 0;
            }
            if(num%2==0){
                num=num/2;
            }
            else if(num%2==1){
                num=num*3+1;
            }
            answer++;
            
            if(answer==500){
                return -1;
            } 
        }while(num!=1);
       
        return answer;
    }
}
