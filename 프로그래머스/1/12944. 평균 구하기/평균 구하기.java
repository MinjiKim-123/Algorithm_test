class Solution {
    public double solution(int[] arr) {
        int total = 0;
		for(int num : arr) {
			total += num;
		}
        double answer = (double)total / arr.length;
        return answer;
    }
}