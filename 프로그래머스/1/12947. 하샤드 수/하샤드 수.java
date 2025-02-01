class Solution {
       public boolean solution(int x) {
    	String[] numArr = String.valueOf(x).split("");
    	int total = 0;
    	for(String num : numArr) 
    		total += Integer.parseInt(num);
    	
        return x % total == 0;
    }

}