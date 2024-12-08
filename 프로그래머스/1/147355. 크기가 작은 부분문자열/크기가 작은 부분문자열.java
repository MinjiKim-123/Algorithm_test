class Solution {
    public int solution(String t, String p) {
        int lastIdx = p.length();
		long pNum = Long.parseLong(p);
		int answer = 0;
		
		for(int i=0; i <= t.length() - p.length(); i++) {
			long subNum = Long.parseLong(t.substring(i, lastIdx)); //문자열 잘라서 숫자로 변환
			lastIdx++;
			if(subNum <= pNum) //p보다 자른 수가 작거나 같을 경우
				answer++; 
		}
		
		return answer;

    }
}