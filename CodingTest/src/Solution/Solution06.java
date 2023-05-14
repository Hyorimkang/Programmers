package Solution;

public class Solution06 {
	public static int solution(int n) {
		int answer = 1;
		do {
			if(n%answer == 1) break;
			else answer++;
		}while(true);
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
}
