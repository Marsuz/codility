import java.math.BigDecimal;

/**
 * Created by Marcin on 2016-04-06.
 */
public class OddOccurencesInArray {

    public static void main(String[] args) {

        int[] A = {9, 2, 2, 3, 9, 3, 7, 7, 7};
        int[] B = {7};
        int[] C = {7, 5, 7};
        int[] D = {3, 4, 4, 4, 5, 4, 4, 4, 3, 3, 3};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));


    }

    public static int solution(int[] A) {

        int result = A[0];

        for ( int i = 1; i < A.length; i++) {

            result ^= A[i];

        }

        return result;

    }

}
