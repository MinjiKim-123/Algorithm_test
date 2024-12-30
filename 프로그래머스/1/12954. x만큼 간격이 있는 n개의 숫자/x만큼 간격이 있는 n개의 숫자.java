class Solution {
    public long[] solution(int x, int n) {
       long[] answer = new long[n];
        for(int i=0; i < n; i++) {
        	long preX = (i == 0 ? 0 : answer[i-1]);
        	long newX = preX + x;
        	answer[i] = newX;
        }
        return answer;
    }
}