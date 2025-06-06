package core;

import java.util.ArrayList;
import java.util.List;

public class Test59 {

    public static void main(String[] args) {
        /*
         * l로 만들기
         *
         * 문제 설명
         * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
         * 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을
         * return 하는 solution 함수를 완성해 주세요.
         *
         *
         * myString	            result
         * "abcdevwxyz"	        "lllllvwxyz"
         * "jjnnllkkmm"	        "llnnllllmm"
         *
         *
         * 입출력 예 #1
         * 0 ~ 4번 인덱스의 문자 "a","b","c","d","e"는 각각 "l"보다 앞서는 문자입니다.
         * 따라서 "l"로 고쳐줍니다.
         * 그 외의 문자는 모두 "l"보다 앞서지 않는 문자입니다. 따라서 바꾸지 않습니다.
         * 따라서 "lllllvwxyz"을 return 합니다.
         *
         * 입출력 예 #2
         * 0번, 1번, 6번, 7번 인덱스의 문자 "j","j","k","k"는
         * 각각 "l"보다 앞서는 문자입니다. 따라서 "l"로 고쳐줍니다.
         *
         */
        class Solution {
            public String solution(String myString) {
                String answer = "";
                for (int i = 0; i < myString.length(); i++) {
                    if (myString.charAt(i) < 'l') {
                        answer += 'l';
                    } else {
                        answer += myString.charAt(i);
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("abcdevwxyz");
        }
    }
