package com.klolarion.programmers;


import java.util.ArrayList;
import java.util.List;

public class PG181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> tmp = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                tmp.add(todo_list[i]);
            }
        }
        String[] answer = new String[tmp.size()];

        answer = tmp.toArray(answer);

        return answer;
    }
}
