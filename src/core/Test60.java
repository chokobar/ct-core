package core;

public class Test60 {

    public static void main(String[] args) {
        /*
         * 정수 부분
         *
         * 문제 설명
         * 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * flo	        result
         * 1.42	        1
         * 69.32	    69
         *
         *
         * 입출력 예 #1
         * 1.42의 정수 부분은 1입니다.
         *
         * 입출력 예 #2
         * 69.32의 정수 부분은 69입니다.
         *
         */
        class Solution {
            public int solution(double flo) {
                int answer = 0;

                answer = (int)flo;
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(1.42);
        }
    }
