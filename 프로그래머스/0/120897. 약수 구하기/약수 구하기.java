class Solution {
   public int[] solution(int n) {
		int count=0;
		for (int i = 1; i < n+1; i++) {
			count+=n%i==0?1:0;
		}
        int[] answer = new int [count];
        int k=0;
        for (int i = 1; i < n+1; i++) {
        	if(n%i==0){
        		answer[k++]=i;
        	}
        }
        return answer;
    }
}