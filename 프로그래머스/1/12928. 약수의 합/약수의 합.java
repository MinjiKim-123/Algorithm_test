class Solution {
    public int solution(int n) {
       int answer = n; // 약수는 자신의 값은 무조건 포함이므로 자신의 값은 미리 삽입
		
		if(answer == 0) // 0이면 바로 종료
			return answer;
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				answer += i;
		}
		
		return answer;
    }
}