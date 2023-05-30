package Solution;

public class Solution11 {
	public static long solution(long n) {
		int length = (int)(Math.log10(n)+1);
		long arr[] = new long[length];
		long temp = 0;
		
        String s =Long.toString(n);
        String[] str = s.split("");
        
        for(int i =0; i<arr.length; i++) {
        	arr[i] = Long.valueOf(str[i]);
        }
        
        for(int i =0; i<arr.length; i++) {
        	for(int j = 0; j<arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        
        String result = "";
        for(int i = 0; i<arr.length; i++) {
        	result += (int) arr[i];
        }
        
        long answer = Long.parseLong(result);
        return answer;
    }
	
}
