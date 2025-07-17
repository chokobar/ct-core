package core;

import java.util.Arrays;

public class Test66 {

    public static void main(String[] args) {
        /*
         * 2의 영역
         *
         * 문제 설명
         * 정수 배열 arr가 주어집니다.
         * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을
         * return 하는 solution 함수를 완성해 주세요.
         * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
         *
         *
         * arr	                        result
         * [1, 2, 1, 4, 5, 2, 9]	    [2, 1, 4, 5, 2]
         * [1, 2, 1]	                [2]
         * [1, 1, 1]	                [-1]
         * [1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
         *
         *
         * 입출력 예 #1
         * 2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의
         * 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
         *
         * 입출력 예 #2
         * 2가 한 개뿐이므로 [2]를 return 합니다.
         *
         * 입출력 예 #3
         * 2가 배열에 없으므로 [-1]을 return 합니다.
         *
         * 입출력 예 #4
         * 2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번
         * 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.

         *
         */
        class Solution {
            public int[] solution(int[] arr) {
                int first = -1;
                int last = -1;

                // 2의 첫 번째와 마지막 위치 찾기
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 2) {
                        if (first == -1) first = i;
                        last = i;
                    }
                }

                // 2가 없는 경우
                if (first == -1) return new int[]{-1};

                // 부분 배열 추출
                int[] result = new int[last - first + 1];
                for (int i = 0; i < result.length; i++) {
                    result[i] = arr[first + i];
                }

                System.out.println(Arrays.toString(result));
                return result;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{1, 2, 1, 4, 5, 2, 9});
        }
    }
