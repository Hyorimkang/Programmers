package Solution;

public class Solution05 {
	public static long[] solution(long x, int n) {
		long[] answer = new long[n];
		
		for(int i = 0; i<n; i++) {
			answer[i] = x*((long)i+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		long x=2; int n =5;
	}

}
