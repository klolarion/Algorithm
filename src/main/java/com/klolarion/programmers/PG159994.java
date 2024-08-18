package com.klolarion.programmers;

public class PG159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        /*
        * 배열1, 배열2, 목표배열
        * 배열1 포인터, 배열2 포인터, 목표배열 순회
        *
        * 배열1 포인터가 배열1 길이보다 작고, 목표배열의 i번째 요소가 배열1의 배열1포인터번째 요소와 같으면
        * -> 배열1 포인터 증가. 다음 반복으로 넘어감.
        * 배열1 분기가 실패하면
        * -> 배열2 포인터가 배열2 길이보다 작고, 목표배열의 i번째 요소가 배열2의 배열2포인터번째 요소와 같으면
        * -> 배열2 포인터 증가. 다음 반복으로 넘어감.
        *
        * 배열1과 배열2 모두 실패하면
        * 실패 결과를 리턴. 메서드 종료
        *
        * 모든 반복이 성공하면
        * 성공 결과를 리턴.
        */

        int a1Pointer = 0;
        int a2Pointer = 0;

        for(int i=0; i< goal.length; i++) {
            if (a1Pointer < cards1.length && goal[i].equals(cards1[a1Pointer])){
                a1Pointer++;
                continue;
            }else if(a2Pointer < cards2.length && goal[i].equals(cards2[a2Pointer])){
                a2Pointer++;
                continue;
            }else {
                answer = "No";
                return answer;
            }
        }
        answer = "Yes";
        return answer;
    }
}
