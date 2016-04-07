package lesson4;

/**
 * Created by Marcin on 2016-04-07.
 */
public class MissingInteger {

    public static void main(String[] args) {

    }

    private static int solution(int[] A) {

        int N = A.length;
        boolean[] numberFlags = new boolean[N + 1];
        for (int i = 0; i < numberFlags.length; i++) numberFlags[i] = false;

        for (int x : A) {
            if ( x <= N && x > 0 ) {
                numberFlags[x] = true;
            }
        }

        for ( int i = 1; i <= N; i++) {

            if ( numberFlags[i] == false ) return i;

        }

        return N + 1;
    }
}
