package com.klolarion.programmers;

import java.util.*;

public class PG42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //순서를 유지하는 map
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();


        //참가자 이름을 key로 map에 등록.
        for(int i = 0; i < participant.length; i++) {
            if(map.containsKey(participant[i])){
                map.put(participant[i], map.get(participant[i]) + 1);
            } else {
                map.put(participant[i], 1);
            }
        }

        //map을 순회하며 완료자 목록을 제거함, 동명이인이 있다면 value를 1 감소시킴
        for(int i = 0; i < completion.length; i++) {
            if(map.containsKey(completion[i])) {
                if (map.get(completion[i]) == 1) {
                    map.remove(completion[i]);
                } else {
                    map.replace(completion[i], map.get(completion[i]) - 1);
                }
            }
        }

        //map에 남아있는 사람이 완주하지 못한사람. key를 가져와서 answer에 저장
        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            answer =  key;
        }

        return answer;
    }
}
