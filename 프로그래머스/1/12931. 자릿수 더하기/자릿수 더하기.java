
public class Solution {
    public int solution(int n) {
        int answer = 0;

        	String nToString = Integer.toString(n);
         
		for(int i=0; i<nToString.length(); i++) {
			answer += Integer.valueOf(nToString.substring(i, i+1));
		}

        return answer;
    }

	
   public int solution2(int n) {
        int answer = 0;

	//찾아보니 나눗셈을 이용해서 풀이를 진행하는 방법이 있는데 이 방법이 성능 및 가독성 면에서 훨씬 나아보인다.
         while(n > 0){
            answer += n % 10;
            n = n/10;
        }
	   
        return answer;
    }
}
