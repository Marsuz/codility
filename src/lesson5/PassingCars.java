package lesson5;

import sun.util.resources.cldr.cs.TimeZoneNames_cs;

/**
 * Created by Marcin on 2016-04-07.
 */
public class PassingCars {

    public static void main(String[] args) {

        int[] A = {0, 1, 0, 1, 1};
        int[] B = {0, 0, 0, 0, 0};
        int[] C = {0};
        int[] D = {1};
        int[] E = {1, 1, 1, 1, 1};
        int[] F = {1, 1, 1, 1, 0};
        int[] G = {1, 1, 1, 0, 1};

        int[] H = new int[100000];
        for ( int i = 0; i < H.length; i++) {

            if ( i % 2 == 0 ) H[i] = 0;
            else H[i] = 1;

        }


        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));
        System.out.println(solution(F));
        System.out.println(solution(G));
        System.out.println(solution(H));

    }

    private static int solution(int[] A) {

        int N = A.length;
        int firstZero = 0;
        long OnesCounter = 0;
        long result = 0;

        while ( firstZero < N && A[firstZero] == 1 ) {
            firstZero++;
        }

        if ( firstZero == N ) return 0;

        for ( int i = firstZero; i < N; i++) {
            OnesCounter += A[i];
        }

        result = OnesCounter;

        for ( int i = firstZero + 1; i < N; i++) {

            if ( A[i] == 0 ) result += OnesCounter;
            else OnesCounter--;

        }

        return result > 1_000_000_000 ? -1 : (int) result;
    }
}
