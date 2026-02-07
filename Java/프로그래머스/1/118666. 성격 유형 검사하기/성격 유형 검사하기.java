class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] type = new String[]{"R", "T", "C", "F", "J", "M", "A", "N"};
        int[] mbti = new int[8];
        int nagIdx = -1;
        int posIdx = -1;
        for(int i=0; i< survey.length; i++) {
            switch(survey[i]) {
                case "RT":
                    nagIdx = 0;
                    posIdx = 1;
                    break;
                case "TR":
                    nagIdx = 1;
                    posIdx = 0;
                    break;
                case "CF":
                    nagIdx = 2;
                    posIdx = 3;
                    break;
                case "FC":
                    nagIdx = 3;
                    posIdx = 2;
                    break;
                case "JM":
                    nagIdx = 4;
                    posIdx = 5;
                    break;
                case "MJ":
                    nagIdx = 5;
                    posIdx = 4;
                    break;
                case "AN":
                    nagIdx = 6;
                    posIdx = 7;
                    break;
                case "NA":
                    nagIdx = 7;
                    posIdx = 6;
                    break;
            }
            switch(choices[i]) {
                case 1:
                    mbti[nagIdx] +=3;
                    break;
                case 2:
                    mbti[nagIdx] +=2;
                    break;
                case 3:
                    mbti[nagIdx] +=1;
                    break;
                case 4:
                    break;
                case 5:
                    mbti[posIdx] +=1;
                    break;
                case 6:
                    mbti[posIdx] +=2;
                    break;
                case 7:
                    mbti[posIdx] +=3;
                    break;
            }
        }
        for(int i = 0; i<4; i++) {
            String result = mbti[2*i] >= mbti[2*i+1] ? type[2*i] : type[2*i+1];
            answer+=result;
        }
        return answer;
    }
}