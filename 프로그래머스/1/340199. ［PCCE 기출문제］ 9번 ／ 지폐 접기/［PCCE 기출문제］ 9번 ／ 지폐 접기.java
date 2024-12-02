class Solution {
    public int solution(int[] wallet, int[] bill) {
       		int billSize1 = bill[0];
		int billSize2 = bill[1];
		int walletSize1 = wallet[0];
		int walletSize2 = wallet[1];
		
		int answer = 0;
		int maxLoop = 10;//무한 루프 실행을 막기 위해 max 설정
		
		while(true && answer <= maxLoop) {
			
			if(billSize1 < walletSize1 && billSize2 < walletSize2 
					|| billSize1 < walletSize2 && billSize2 < walletSize1) 
				break;
			
			
			if(billSize1 > billSize2)
				billSize1 = billSize1 / 2;
			else 
				billSize2 = billSize2 / 2;
				
			answer++;
		}
		
		return answer;
    }
}
