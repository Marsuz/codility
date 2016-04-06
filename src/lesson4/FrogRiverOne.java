package lesson4;

/**
 * Created by Marcin on 2016-04-07.
 */
public class FrogRiverOne {

    public static void main(String[] args) {

        int[] A = new int[100_000];
        for (int i = 1; i <= 100_000; i++) A[i - 1] = i;

        System.out.println(solution(100_000, A));

    }

    private static int solution(int X, int[] A) {

        boolean[] positions = new boolean[X + 1];
        for(int i = 0; i < X; i++) positions[i] = false;


        long posSum = ((long)X * (X + 1)) / 2;

        for ( int i = 0; i < A.length; i++) {

            if ( positions[A[i]] == false ) {

                positions[A[i]] = true;
                posSum -= A[i];

            }

            if ( posSum == 0 ) return i;

        }

        return -1;

    }

}
