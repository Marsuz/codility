package lesson3;

/**
 * Created by Marcin on 2016-04-06.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {

        // Tests

        int[] A = {3, 1, 2, 4, 3};
        int[] B = {1};
        int[] C = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] D = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] E = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] F = {1000, -1000};
        int[] G = {2000, 0};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));
        System.out.println(solution(F));
        System.out.println(solution(G));

    }

    private static int solution(int[] A) {

        int N = A.length;

        int sumLeft = 0;
        int sumRight = 0;
        int result;

        for(int x : A) {
            sumRight += x;
        }

        result = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {

            sumLeft += A[i - 1];
            sumRight -= A[i - 1];
            if ( result > Math.abs(sumLeft - sumRight) )
                result = Math.abs(sumLeft - sumRight);

        }

        return result;

    }
}
