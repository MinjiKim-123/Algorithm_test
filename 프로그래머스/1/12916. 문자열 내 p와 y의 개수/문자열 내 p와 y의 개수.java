class Solution {
    boolean solution(String s) {
        String upperString = s.toUpperCase();
        int pCount = 0;
        int yCount = 0;
        for(int i =0; i<upperString.length(); i++) {
        	char item = upperString.charAt(i);
        	if('P' == item)
        		pCount++;
        	else if('Y' == item)
        		yCount++;
        }
        
        return (pCount == yCount);
    }
}