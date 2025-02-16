class Solution {
    public int solution(int[] absolutes, boolean[] signs) {        
       int answer = 0;
        for(int i=0; i<absolutes.length; i++) {
        	int num = absolutes[i];
        	boolean sign = signs[i];
        	if(!sign)
        		num = num*-1;
        	answer += num;
        }
        return answer;
    }
}