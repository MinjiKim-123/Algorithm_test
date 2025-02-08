import java.util.*;

class Solution {
   
    public int[] solution(int[] array, int divisor) {
        int [] answer = Arrays.stream(array).filter(num -> num % divisor ==0).sorted().toArray();
		return answer.length == 0 ? new int[] {-1} : answer;
    }
}