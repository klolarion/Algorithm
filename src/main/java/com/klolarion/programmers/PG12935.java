package com.klolarion.programmers;


public class PG12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] result = new int[arr.length - 1];

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }


        int index = 0;

        // 원래 배열을 순회하면서 최소 숫자 인덱스를 제외하고 결과 배열에 값 복사
        for (int i = 0; i < arr.length; i++) {
            if (i != min) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}