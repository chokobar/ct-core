package core;

import java.util.Arrays;

public class Test63 {

    public static void main(String[] args) {
        /*
         * 조겐에 맞게 수열 번환하기
         *
         * 문제 설명
         * 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
         * 50보다 작은 홀수라면 2를 곱합니다.
         * 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
         *
         *
         * arr	                    result
         * [1, 2, 3, 100, 99, 98]	[2, 2, 6, 50, 99, 49]
         *
         *
         * 입출력 예 #1
         * 1, 3은 50 미만의 홀수 이므로 2를 곱하고, 100, 98은 50 이상의 짝수이므로 2로 나눕니다.
         * 나머지 값들은 변경 조건에 해당하지 않으므로 바꾸지 않습니다.
         * 따라서 [2, 2, 6, 50, 99, 49]를 return 합니다.
         *
         */
        class Solution {
            public int[] solution(int[] arr) {
                int[] answer = new int[arr.length];

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 50 && arr[i] % 2 == 0) {
                        answer[i] = arr[i] / 2;
                    } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                        answer[i] = arr[i] * 2;
                    } else {
                        answer[i] = arr[i];
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[] { 1, 2, 3, 100, 99, 98 });
        }
    }
