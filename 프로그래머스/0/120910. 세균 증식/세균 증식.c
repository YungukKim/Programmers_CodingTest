#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int t) {
    int answer = 0;
    
    while(t > 0){
        n *= 2;
        t--;
    }
    return n;
}