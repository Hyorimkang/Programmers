package Solution;

public class Solution01 {
	public static int solution(int n) {
		int answer = 0;
		
		for(int i =1; i<3000; i++) {
			if(n%i==0) {
				int divisor = n/i;
				answer += divisor;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int n = 12;
		System.out.println(n+"의 약수의 합은 " + solution(n));
		
	}

}
