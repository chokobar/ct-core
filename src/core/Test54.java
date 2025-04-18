package core;

import java.util.Arrays;

public class Test54 {

    public static void main(String[] args) {
        /*
         * 카운트 업
         *
         * 문제 설명
         * 정수 start_num와 end_num가 주어질 때,
         * start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         *
         *
         * start_num	end_num	    result
         * 3	        10	        [3, 4, 5, 6, 7, 8, 9, 10]
         *
         *
         * 입출력 예 #1
         * 3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.
         *
         */
        class Solution {
            public int[] solution(int start_num, int end_num) {
                int length = end_num - start_num + 1;
                int[] answer = new int[length];
                for (int i = 0; i < length; i++) {
                    answer[i] = start_num + i;
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(3 , 10);
        }
    }
