
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int currTime = this.timeToInt(pos);    	
    	int vodTime = this.timeToInt(video_len);
    	int opStartTime = this.timeToInt(op_start);
    	int opEndTime = this.timeToInt(op_end);
    	
         for(String item : commands){	  
             
            if(opStartTime <= currTime && currTime <= opEndTime)
        		currTime = opEndTime;
           
        	if("prev".equals(item))
        		currTime -= 10;   	
    		else
    			currTime += 10;
             
            if(currTime < 0)
                currTime = 0;
            else if(vodTime < currTime)
                currTime = vodTime;
             
           if(opStartTime <= currTime && currTime <= opEndTime)
    	        currTime = opEndTime;
            
        }

        int min = currTime / 60;
        int sec = currTime % 60;
        
        String answer = String.format("%02d:%02d", min, sec);
        return answer;
    }
    
    private int timeToInt(String time) {
    	String[] arr = time.split(":");
    	int result = Integer.parseInt(arr[0]) * 60;
    	result += Integer.parseInt(arr[1]);
    	return result;
    }
}