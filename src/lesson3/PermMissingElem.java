package lesson3;

/**
 * Created by Marcin on 2016-04-06.
 */
public class PermMissingElem {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] B = {1};
        int[] C = {2};
        int[] D = {1, 3};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(null));


    }

    private static int solution(int[] A) {

        if ( A == null) return 1;

        long N = A.length;
        long correctSum = ((N + 1) * (N + 2) / 2);
        long sum = 0;
        for ( int x : A ) {
            sum += x;
        }

        return (int) (correctSum - sum);

    }
}
