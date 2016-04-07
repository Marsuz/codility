package lesson4;

/**
 * Created by Marcin on 2016-04-07.
 */
public class MaxCounters {

    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};

        int[] result = solution(5, A);

        for ( int i = 0; i < result.length; i++ ) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] solution(int N, int[] A) {

        int[] counter = new int[N];
        int lastMax = 0;
        int currentMax = 0;

        for ( int i = 0; i < A.length; i++) {

            if ( A[i] <= N ) {

                if ( counter[A[i] - 1] < lastMax ) {
                    counter[A[i] - 1] = lastMax + 1;
                } else {
                    counter[A[i] - 1]++;
                }
                if ( counter[A[i] - 1] > currentMax ) currentMax = counter[A[i] - 1];

            } else {

                lastMax = currentMax;

            }

        }

        for ( int i = 0; i < N; i++ ) {

            if ( counter[i] < lastMax ) counter[i] = lastMax;

        }

        return counter;

    }
}

