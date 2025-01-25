import java.util.*;
class Solution {
    public long solution(long n) {
       	String[] numArr = String.valueOf(n).split("");
		Arrays.sort(numArr, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(String num : numArr) 
			sb.append(num);
		
		long answer = Long.parseLong(sb.toString());
		return answer;
    }
}