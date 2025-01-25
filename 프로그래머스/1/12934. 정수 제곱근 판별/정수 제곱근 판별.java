class Solution {
    public long solution(long n) {
        double sqrtNum = Math.sqrt(n);
		long answer = (long) (sqrtNum % 1 == 0? Math.pow(sqrtNum +1, 2) : -1);
		return answer;
    }
}