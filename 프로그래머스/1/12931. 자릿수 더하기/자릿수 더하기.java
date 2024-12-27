
public class Solution {
    public int solution(int n) {
        int answer = 0;

        	String nToString = Integer.toString(n);
         
		for(int i=0; i<nToString.length(); i++) {
			answer += Integer.valueOf(nToString.substring(i, i+1));
		}

        return answer;
    }
}