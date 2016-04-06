package lesson2;

/**
 * Created by Marcin on 2016-04-07.
 */
public class CyclicRotation {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        A = solution(A, 5);

        for ( int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    private static int[] solution(int[] A, int K) {

        int N = A.length;
        int[] B = new int[N];

        for ( int i = 0; i < N; i++) {

            B[(i + K) % N] = A[i];

        }

        for ( int i = 0; i < N; i++) {

            A[i] = B[i];

        }

        return A;
    }
}
