
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (String s: keyinput) {
            if (s.equals("up")) {
                if ((board[1] - 1) / 2 > answer[1]) {
                    answer[1] += 1;
                }
            } else if (s.equals("down")) {
                if ((-1*(board[1] - 1) / 2) <answer[1]) {
                    answer[1] -= 1;
                }
            } else if (s.equals("left")) {
                if ((-1*(board[0] - 1) / 2 )< answer[0]) {
                    answer[0] -= 1;
                }
            } else if (s.equals("right")) {
                if ((board[0] - 1) / 2 > answer[0]) {
                    answer[0] += 1;
                }
            }
        }
        return answer;
    }
}

