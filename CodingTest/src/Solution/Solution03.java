package Solution;

public class Solution03 {
	
	public static String solution(int num) {
		String answer="";
		
		if(num%2==0) {
			answer = "Even";
		}
		else {
			answer = "Odd";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int num = 1;
		System.out.println(solution(num));

	}

}
