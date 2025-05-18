package core;

public class Test57 {

    public static void main(String[] args) {
        /*
         * 첫번째로 나오는 음수
         *
         * 문제 설명
         * 정수 리스트 num_list가 주어질 때,
         * 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
         * 음수가 없다면 -1을 return합니다.
         *
         *
         * num_list	                        result
         * [12, 4, 15, 46, 38, -2, 15]	    5
         * [13, 22, 53, 24, 15, 6]	        -1
         *
         *
         * 입출력 예 #1
         * 5번 인덱스에서 음수가 처음 등장하므로 5를 return합니다.
         *
         * 입출력 예 #2
         * 음수가 없으므로 -1을 return합니다.
         *
         */
        class Solution {
            public int solution(int[] num_list) {
                int answer = 0;

                for(int i = 0; i < num_list.length; i++) {
                    if(num_list[i] < 0) {
                        answer = i ;
                        break;
                    } else {
                        answer = -1;
                    }
                }

                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{12, 4, 15, 46, 38, -2, 15});
        }
    }
