package core;

public class Test22 {

    public static void main(String[] args) {
        /*
         * 주사위 게임
         *
         * 문제 설명
         * 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
         * a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
         * a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
         * a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
         * 두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
         *
         *
         *
         * 입출력 예 #1
         * 예제 1번에서 두 주사위 숫자가 모두 홀수이므로 32 + 52 = 9 + 25 = 34점을 얻습니다. 따라서 34를 return 합니다.
         *
         * 입출력 예 #2
         * 예제 2번에서 두 주사위 숫자 중 하나만 홀수이므로 2 × (6 + 1) = 2 × 7 = 14점을 얻습니다. 따라서 14를 return 합니다.
         *
         * 입출력 예 #3
         * 예제 3번에서 두 주사위 숫자가 모두 홀수가 아니므로 |2 - 4| = |-2| = 2점을 얻습니다. 따라서 2를 return 합니다.
         *
         * a	b	result
         * 3	5	34
         * 6	1	14
         * 2	4	2
         *
         *
         */
        class Solution {
            public int solution(int a, int b) {
                int answer = 0;
                if (a % 2 != 0 && b % 2 != 0) {
                    answer = (a * a) + (b * b);
                } else if (a % 2 != 0 || b % 2 != 0) {
                    answer = 2 * (a + b);
                } else {
                    answer = Math.abs(a - b);
                }
                System.out.println(answer);
                return answer;
            }
        }
        Solution sol = new Solution();
        sol.solution(3 , 5);
    }
}
