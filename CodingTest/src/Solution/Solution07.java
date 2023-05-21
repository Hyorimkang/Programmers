package Solution;

public class Solution07 {
	static boolean solution(String s) {
		boolean answer = false;
		int cntP=0, cntY=0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='P' || s.charAt(i)=='p') {
				cntP++;
			}
			else if(s.charAt(i)=='Y' || s.charAt(i)=='y') {
				cntY++;
			}
		}
		if(cntP==cntY || cntP+cntY==0) {
			answer = true;
		}
		else if(cntP!=cntY){
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "aaap";
		//System.out.println(s.charAt(0));
		System.out.println(solution(s));
	}
}
