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
}