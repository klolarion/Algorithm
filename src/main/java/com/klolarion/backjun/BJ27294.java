package com.klolarion.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 27294
 * https://www.acmicpc.net/problem/27294
 */


//술 = 1 && 아침 || 저녁 => 밥알 280

//술 = 1 && 점심 => 밥알 280
//술 = 0 && 점심 => 밥알 320 **

//밥알이 320인경우만 분기처리해주면 간단


public class BJ27294 {
    public static void main(String[] args) {

        //Scanner보다 성능 좋음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int rice = 0;
            //입력값을 빈칸으로 나누어 배열에 저장
            String[] input = br.readLine().split(" ");

            //입력값 순서대로 형변환하여 변수에 할당
            int time = Integer.parseInt(input[0]);
            int withDrink = Integer.parseInt(input[1]);

            //시간이 점심인지 확인
            boolean isLunch = time >= 12 && time <= 16 ? true : false;


            //술을 안마시고 점심이라면 밥알 320, 나머지는 밥알 280 설정
            if (withDrink == 0 && isLunch) {
                rice = 320;
            } else {
                rice = 280;
            }

            //결과 출력
            System.out.println(rice);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
