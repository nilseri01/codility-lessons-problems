// https://app.codility.com/programmers/lessons/17-dynamic_programming/number_solitaire/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] sumA = new int[A.length];
        // pebble on 0 is ensured
        sumA[0] = A[0];

        for(int i = 1; i < A.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 1; j <= 6; j++) {
                if(i - j >= 0) {
                    max = Math.max((sumA[i - j] + A[i]), max);
                }
            }
            sumA[i] = max;
        }

        return sumA[A.length-1];
    }
}
