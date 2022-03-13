package Doubts;

/*
    int a = 0, b = 0;    -> 2
    for (i = 0; i < N; i++) { -> N
        for (j = 0; j < N; j++) { -> N*N
            a = a + j; -> 1*N*N
        }
    }
    for (k = 0; k < N; k++) { -> N
        b = b + k; -> 1*N
    }

    TC = 2 + N +N^2+N^2+N+N = 2*N^2 + 3*N + 2 = O(N*N)
    SC = 5 = O(1)
*/

public class TimeComplexity {
}
