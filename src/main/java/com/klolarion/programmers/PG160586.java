package com.klolarion.programmers;

public class PG160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i=0; i<targets.length; i++){
            char[] cTmp = targets[i].toCharArray();
            //target 요소 탐색
            for (char c : cTmp) {
                int indexTmp = 100;

                //keymap 요소 탐색
                for (String s : keymap) {
                    //target의 문자가 keymap의 각 요소들의 몇번째에 있는지 확인.
                    //가장 적은수를 최소값 변수에 추가
                    int keyTmp = s.indexOf(c);

                    if(keyTmp > -1 && indexTmp > keyTmp){
                        indexTmp = keyTmp;
                    }
                }

                //결과값 분기
                if(indexTmp < 100 && answer[i] != -1){
                    answer[i] += indexTmp + 1;
                }else {
                    answer[i] = -1;
                }
            }
        }

        return answer;
    }
}
