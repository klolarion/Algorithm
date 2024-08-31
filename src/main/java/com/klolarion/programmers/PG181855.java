package com.klolarion.programmers;

public class PG181855 {
    public int solution(String[] strArr) {
        int answer = 0;
        //순회하면서 문자열 개수 누적
        int[] length = new int[31]; //0~30
        //가장 큰 조합의 개수
        int max = 0;

        for(int i=0; i < strArr.length; i++){
            //요소문자열의 길이확인
            length[strArr[i].length()]++;
            //
            if(length[strArr[i].length()] > max){
                max = length[strArr[i].length()];
            }
        }

        return max;
    }
}
