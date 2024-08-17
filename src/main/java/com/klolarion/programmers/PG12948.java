package com.klolarion.programmers;

public class PG12948 {
    public String solution(String phone_number) {
        // . -> 모든 문자. 처음부터 순서대로 매칭
        // ?= -> 전방탐색 뒤에 붙는조건에따른 위치부터 역순으로 맨 앞까지 탐색
        // .{n} -> n번 반복되는 경우(맨 앞에 모든 문자라는 조건(.)이 붙어있기 때문에 어떤 문자든 n개가 있는지 판단)
        // ?=.{4} -> 포인터 뒤에 4개의 문자열이 남아있는지 확인 후 역순으로 맨 앞까지 replacement 진행
        // .(?=.{4}) -> 처음부터 탐색, 뒤에 4개의 문자열이 남아있다면 그 부분부터 역순으로 탐색하면서 replacement 진행

        // $ -> 문자열 끝을 의미함.
        return phone_number.replaceAll("[.(?=.{4})]", "*");
    }
}
