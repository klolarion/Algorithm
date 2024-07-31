package com.klolarion.programmers;

public class PG181935 {
    public int solution(int n) {
        int answer = 0;

        if(n%2==0){
            //짝수일경우
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    answer += i * i;
                }
            }

        }else{
            //홀수일경우
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    answer += i;
                }
            }

        }
        return answer;
    }
}
