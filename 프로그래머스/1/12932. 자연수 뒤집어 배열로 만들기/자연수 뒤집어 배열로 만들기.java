class Solution {
    public int[] solution(long n) {
       String stringNum = String.valueOf(n);
    	int numberLength = stringNum.length();
    	int[] answer = new int[numberLength];
    	int numIndex = numberLength;
    	for(int i=0; i<numberLength; i++) {
    		numIndex--;
    		answer[numIndex] = Character.getNumericValue(stringNum.charAt(i));
    	}
    	
        return answer;
    }
}