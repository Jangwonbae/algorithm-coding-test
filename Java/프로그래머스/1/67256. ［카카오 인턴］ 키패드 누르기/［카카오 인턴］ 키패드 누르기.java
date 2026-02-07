class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder("");
        int[][] keyPad = new int[][] 
        {{1, 2, 3},{4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
        int leftRow = 3;
        int leftColumn = 0;
        int rightRow = 3;
        int rightColumn = 2;
    
        for(int num : numbers) {
            if(num == 1 || num == 4 || num == 7) {
                answer.append("L");
                for(int i=0; i<keyPad.length; i++) {
                    if(keyPad[i][0] == num) {
                        leftRow = i;
                        leftColumn = 0;
                        break;
                    }
                }
            } else if(num == 3 || num == 6 || num == 9) {
                answer.append("R");
                for(int i=0; i<keyPad.length; i++) {
                    if(keyPad[i][2] == num) {
                        rightRow = i;
                        rightColumn = 2;
                        break;
                    }
                }
            } else {
                for(int i=0; i<keyPad.length; i++) {
                    if(keyPad[i][1] == num) {
                        int leftDis = Math.abs(i-leftRow) + Math.abs(1-leftColumn);
                        int rigthDis = Math.abs(i-rightRow) + Math.abs(1-rightColumn);
                        if(leftDis < rigthDis) {
                            answer.append("L");
                            leftRow = i;
                            leftColumn = 1;
                            break;
                        } else if(rigthDis < leftDis) {
                            answer.append("R");
                            rightRow = i;
                            rightColumn = 1;
                            break;
                        } else {
                            if(hand.equals("left")) {
                                answer.append("L");
                                leftRow = i;
                                leftColumn = 1;
                                break;
                            } else {
                                answer.append("R");
                                rightRow = i;
                                rightColumn = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return answer.toString();
    }
}