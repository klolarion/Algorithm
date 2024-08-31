package com.klolarion.programmers;

import java.util.*;

public class PG135808 {
        public int solution(int k, int m, int[] score) {

            //사과상태에따라 1~k점까지 분류, 1점이 최하
            //박스에 m개의 사과
            //박스에 최하품질은 p
            //사과박스의 가격은 p * m
            //박스단위로 판매, 남는사과 버림


            //가장 큰 수인 k부터 박스에 담고 남는자리는 k-1순서로 채워야 박스가격이 높게 유지됨

            int answer = 0;


            List<Integer> scores = new ArrayList<>();
            List<Integer> box = new ArrayList<>();
            for(int s:score) {
                scores.add(s);
            }

            // 오름차순으로 정렬
            Collections.sort(scores);
            for(int i = scores.size() - 1; i >= 0; i--) {
                if(box.size() < m){
                    //뒤에서부터 추출(큰값부터) 후 박스에 담음
                    box.add(scores.get(i));
                    continue;
                } else {
                    //박스크기만큼 요소가 채워지면 최소값을 찾아 결과값에 더해줌
                    //박스 비우기
                    int min = box.get(m-1);
                    answer += min * m;
                    box.clear();
                    box.add(scores.get(i));
                }
            }

            //마지막 박스 검증
            if(box.size() == m) {
                int min = box.get(m-1);
                answer += min * m;
            }


            return answer;
        }
}
