package lesson4;

/**
 * Created by Marcin on 2016-04-07.
 */
public class PermCheck {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int[] B = {1};
        int[] C = {1, 2};
        int[] D = {2, 2};
        int[] E = {1000};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));

    }

    private static int solution(int[] A) {

        int N = A.length;
        boolean[] numberFlags = new boolean[N + 1];
        for (int i = 0; i < numberFlags.length; i++) numberFlags[i] = false;

        for (int x : A) {

            if ( x > N ) return 0;
            if (numberFlags[x] == false) {
                numberFlags[x] = true;
            } else return 0;

        }

        return 1;

    }
}
