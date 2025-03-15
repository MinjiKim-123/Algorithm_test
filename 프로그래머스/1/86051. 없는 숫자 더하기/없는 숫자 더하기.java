import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        set.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));       
		for(int num : numbers) 
			set.remove(num);	
        
       int answer = 0;
		for(int noExistNum : set)
			answer += noExistNum;

        return answer;
    }
    // 보기에도 간단하고 성능 생각하면 이 방법이 더 나은 듯...!
    public int solution2(int[] numbers) { 
      int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}