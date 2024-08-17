package com.klolarion.backjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 결론
 * - 문자열 사용시 for문이 효율적
 * - List 사용시 문자교체방식이 효율적
 */


public class BJ2442 extends Thread {
    public static void main(String[] args) {

        BJ2442 main = new BJ2442();

        Thread fThread = new Thread();
        Thread sThread = new Thread();

        long f = 0;
        long s = 0;

        int N = 500;

        fThread.start();
        f = main.forMethod(N);
        fThread.interrupt();

        sThread.start();
        s = main.stringMethod(N);
        sThread.interrupt();

        System.out.println("For :" + f + "ms");
        System.out.println("Str :" + s + "ms");

    }

    public long forMethod(int n) {
        long startTime = System.currentTimeMillis();

        int N = n;

        for (int i = 1; i <= N; i++) {

            // 공백찍기
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }

            // 별찍기
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }


        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long stringMethod(int n) {
        long startTime = System.currentTimeMillis();

        int N = n;

        //기준이될 N*2 크기만큼의 공백문자열 생성
//        String line = String.join(" ", Collections.nCopies(N*2, " "));
        //문자열 편집을위해 StringBuilder로 변형
//        StringBuilder sb = new StringBuilder(line);

        List<String> list = new ArrayList<>(Collections.nCopies(N * 2 - 1, " "));

        //포인터 변수들

        //기준 포인터
        int p = N - 1;
        //우측 포인터
        int r = p;
        //좌측 포인터
        int l = p;

        for (int i = 0; i < N; i++) {
            list.set(l, "*");
            list.set(r, "*");
            //매 루프마다 좌, 우 포인터 위치 이동
            l -= 1;
            r += 1;
            System.out.println(String.join("", list));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

