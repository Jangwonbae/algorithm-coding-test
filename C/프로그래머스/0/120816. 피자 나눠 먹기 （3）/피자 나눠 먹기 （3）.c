#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0;
    if(n<= slice) {
        answer = 1;
    } else {
        answer = n/slice + (n%slice==0? 0:1);
    }
    return answer;
}