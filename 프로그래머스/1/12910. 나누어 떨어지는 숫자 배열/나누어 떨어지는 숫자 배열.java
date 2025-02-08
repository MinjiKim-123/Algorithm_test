import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
             if (num % divisor == 0) 
				list.add(num);
        }

        if (list.size() == 0)
            list.add(-1);
	
		Collections.sort(list);
		
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    //이렇게 stream의 filter를 사용하는 방법도 괜찮을 듯..??
    public int[] solution2(int[] array, int divisor) {
        int [] answer = Arrays.stream(arr).filter(num -> num % divisor ==0).sorted().toArray();
		return answer.length == 0 ? new int[] {-1} : answer;
    }
}