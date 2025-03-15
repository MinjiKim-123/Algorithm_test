class Solution {
    public int solution(int num) {
        if(num == 1) 
            return 0;
    
        long currentNum = num;
        int answer = 0;
        while(currentNum > 1 && answer < 500) {
        	if(currentNum % 2 == 0)
        		currentNum = currentNum / 2;
        	else
        		currentNum = currentNum * 3 + 1;
        	answer++;
        }
        return (answer >= 500 && currentNum != 1 ? -1 :answer);
    }
}