package core;

public class Test20 {

    public static void main(String[] args) {
        /*
         * n의 배수
         *
         * 문제 설명
         * 정수 num과 n이 매개 변수로 주어질 때,
         * num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
         *
         *
         *
         * 입출력 예 #1
         * 98은 2의 배수이므로 1을 return합니다.
         *
         * 입출력 예 #2
         * 32는 3의 배수가 아니므로 0을 return합니다.
         *
         * num	n	result
         * 98	2	1
         * 34	3	0
         *
         *
         */
        class Solution {
            public int solution(int num, int n) {
                int answer = 0;
                if (num % n == 0) {
                    answer = 1;
                } else {
                    answer = 0;
                }
                return answer;
            }
        }


        Solution sol = new Solution();
        sol.solution(98 , 2);

    }
}
