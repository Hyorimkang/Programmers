package Solution;

public class Solution04 {
	public static double solution(int[]arr) {
		double answer = 0.0;
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		answer = (double)sum/arr.length;
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
//		arr[0] = 5;
//		arr[1] = 5;
		System.out.println(solution(arr));

	}

}
