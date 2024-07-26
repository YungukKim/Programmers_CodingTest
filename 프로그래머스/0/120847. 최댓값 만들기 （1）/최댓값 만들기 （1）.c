#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
     
    for (size_t i = 0; i < numbers_len - 1; i++) {
        for (size_t j = 0; j < numbers_len - i - 1; j++) {
            if (numbers[j] < numbers[j + 1]) {
                int box = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = box;
            }
        }
    }
    answer = numbers[0] * numbers[1];
    
    return answer;
}