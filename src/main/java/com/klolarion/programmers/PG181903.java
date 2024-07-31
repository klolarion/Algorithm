package com.klolarion.programmers;

public class PG181903 {
    public String solution(int q, int r, String code) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<code.length(); i++){
            int c = code.charAt(i);
            System.out.println(c);

            System.out.println(c % q + ", " + (char) c);
            if(c % q == r){
                sb.append((char) c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
