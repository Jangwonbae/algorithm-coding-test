class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int time = switchSec(pos);
        int len = switchSec(video_len);
        int opStart = switchSec(op_start);
        int opEnd = switchSec(op_end);
        time = opSkip(time, opStart, opEnd);
        for(int i=0; i<commands.length; i++) {
            switch(commands[i]) {
                case "prev":
                time = prev(time, len, opStart, opEnd);
                break;
                case "next":
                time = next(time, len, opStart, opEnd);
                break;
            }
        }
        return switchTimeFormat(time);
    }
    public int switchSec(String time) {
        int x =  Integer.parseInt(time.replaceAll(":",""));
        return x/100*60 + x%100;
    }
    public String switchTimeFormat(int time) {
        int min = time/60;
        int sec = time%60;
        
        String stringMin = min < 10? "0"+min : min+"";
        String stringSec = sec < 10? "0"+sec : sec+"";
        return stringMin+":"+stringSec;
    }
    public int next(int time, int video_len, int op_start, int op_end) {
        int pos = time+10 > video_len? video_len : time+10;
        return opSkip(pos, op_start, op_end);
    }
    public int prev(int time, int video_len, int op_start, int op_end) {
        int pos = time-10 < 0? 0 : time-10;
        return opSkip(pos, op_start, op_end);
    }
    public int opSkip(int time, int op_start, int op_end) {
        int pos = time;
        if(time >= op_start && time <= op_end) {
            pos=op_end;
        }
        return pos;
    }
}