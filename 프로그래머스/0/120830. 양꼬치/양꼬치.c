#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    int free_coke = 0;
    
    answer = (n * 12000) + (k * 2000);
    
    if(n >= 10){
        free_coke = (n / 10) * 2000;
    }
    
    return answer - free_coke;
}