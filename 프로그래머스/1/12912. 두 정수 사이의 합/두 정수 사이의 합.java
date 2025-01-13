class Solution {
    public long solution(int a, int b) {
       		if(a == b)
			return a;
		
		int startNum;
		int endNum;
		
		if(a < b) {
			startNum = a;
			endNum = b;
		}else {
			startNum = b;
			endNum = a;
		}
		
		long answer = 0;
		for(int i = startNum; i <= endNum; i++) {
			answer += i;
		}
        
        return answer;
    }
}