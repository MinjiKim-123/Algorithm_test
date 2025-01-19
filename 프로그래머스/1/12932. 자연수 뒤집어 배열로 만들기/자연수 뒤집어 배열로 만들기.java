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

    //아래 방식처럼 Stringbuilder를 사용해 푸는 것도 좋아보임.
     public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
