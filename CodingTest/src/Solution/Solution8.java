package Solution;

public class Solution8 {
	 public static long[] solution(long n) {
		 String s = String.valueOf(n);
		 int length = s.length();
		 long[] answer = new long[length];
		    
	     for(int i =0; i<length; i++){
	    	 answer[i] = n%10;
	    	 n/=10;
	     }
		    return answer;
	    }
}
