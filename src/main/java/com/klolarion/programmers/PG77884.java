package com.klolarion.programmers;

public class PG77884 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            int div = 0;

            for(int i=left; i<=right; i++){
                div = 0;
                for(int j=1; j<=i; j++){
                    if(i%j==0){ //나누어 떨어지면 카운트 +
                        div++;
                    }
                }
                if(div != 0 && div%2==0){
                    answer += i;
                }else{
                    answer -= i;
                }
            }
            return answer;
        }
    }
}
