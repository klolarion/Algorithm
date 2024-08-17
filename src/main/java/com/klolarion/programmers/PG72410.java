package com.klolarion.programmers;

public class PG72410 {
        public String solution(String new_id) {
            String answer = "";

            answer = new_id.toLowerCase(); //1

            answer = answer.replaceAll("[^a-z0-9-_.]*", ""); //2

            answer = answer.replaceAll("\\.{2,}", "."); //3

            answer = answer.replaceAll("^\\.|\\.$", ""); //4

            if (answer.isEmpty()) { //5
                answer = "a";
            }

            if (answer.length() >= 16) { //6
                answer = answer.substring(0,15);
                answer = answer.replaceAll("\\.$", "");
            }

            if (answer.length() <= 2) { //7
                for (int i = answer.length(); i < 3; i++) {
                    answer +=  answer.charAt(i-1);
                }
            }

            return answer;
        }
}
